import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //movement with the wasd keys
    public void act() 
    {
        
        if (Greenfoot.isKeyDown("d"))
        { setLocation(getX()+5, getY());
         }
         
        if (Greenfoot.isKeyDown("a"))
        { setLocation(getX()-5, getY());
        }
        if (Greenfoot.isKeyDown("s")){
        setLocation(getX(), getY()+5);
        }
        if (Greenfoot.isKeyDown("w")){
        setLocation(getX(), getY()-5);
        }
        
       }
    }   


