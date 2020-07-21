import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world in which the people will move
 * 
 * @author Ridhi Tamirasa
 * @version 1.0 6/4/2020
 */
public class MyWorld extends World
{
private static final int NUMBER_OF_PEOPLE = 40;
private static final int WIDTH = 1000;
private static final int HEIGHT = 600;
    /**
     * Constructor for objects of class MyWorld.
     * Create the world and add people
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH, HEIGHT, 1); 
        populate();
    }
    private void populate()
    {
       person person = new person();
       person.infect();
       addObject(person,500,300);
    for (int i=0; i<NUMBER_OF_PEOPLE; i++){
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getWidth());
            addObject(new person(), x, y);
        
        }  
    }
}
