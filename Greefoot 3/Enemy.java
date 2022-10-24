import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public void act()
    {
        //setRotation(180);
        move(speed);
        //removeEnemy();
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    public int speed = 2; //variable global
    public Enemy()
    {
        setRotation(180);
    }
    public Enemy(int speed)//variable lokal
    { 
        setRotation(180);
        this.speed = speed;
    }
    /*public void removeEnemy()
    {
        if(isAtEdge())
        {
             getWorld().removeObject(this);
        }
    }*/
    
    


}
