import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aperson in a virus simulation
 * 
 * @author Ridhi Tamirasa 
 * @version 1.0
 */
public class person extends Actor
{
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        if (isAtEdge()){
            turn(87);
    }    
}}
