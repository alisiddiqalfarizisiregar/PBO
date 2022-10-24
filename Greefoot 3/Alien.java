import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends World
{

    /**
     * Constructor for objects of class Alien.
     * 
     */
    public Alien()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    int enemyCount = 0;
    public void act()
    {
        /*enemyCount = (enemyCount+2)%300; //berulang setiap 5 detik
        if(enemyCount == 0) //akan berulang setiap reset
        {
            addEnemy(); //tambah enemy baru
        }*/
        spawnEnemy();
    }
    public void addEnemy()
    {
        addObject(new Enemy(),600,Greenfoot.getRandomNumber(400));
    }
    
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,89,232);

        /*Enemy enemy = new Enemy();
        addObject(enemy,458,111);*/
    }
    public int timerEnemy = 0;
    public void spawnEnemy(){
        if (timerEnemy==180){ //jika timer=3 detik
            //Enemy enemy = new Enemy();
            //int speed = Greenfoot.getRandomNumber(4) + 1;
            addObject(
                new Enemy(
                    Greenfoot.getRandomNumber(4) + 1
                ),
                599,
                Greenfoot.getRandomNumber(400));
                
            timerEnemy = 0;
        }else{
            timerEnemy++;
        }
    }
    
}
