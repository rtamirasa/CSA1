import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //static variables so that they don't change
private static final int NUMBER_OF_PLAYERS = 2;
private static final int WIDTH = 600;
private static final int HEIGHT = 400;

// helped in future when working with basketball, is touching method
public Player Player;
public Player2 Player2;

//background music began to be initialized here
 GreenfootSound backgroundMusic = new GreenfootSound("backsound.mp3");
    /**
     * Constructor for objects of class MyWorld.
     */
     
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDTH, HEIGHT, 1); 
        addPlayers();
                         
    }
    /**
     * Begin by adding playerss in specified sections
     * 
     */
    private void addPlayers()
    {
       //new player1
       Player Player = new Player(); 
       addObject(new Player(), 550, 200);
       //new player2
       Player2 Player2 = new Player2();
       addObject(new Player2(), 50, 200);
       //new basketball
       Basketball Basketball = new Basketball();
       addObject(new Basketball(), 300, 200);
       
    } 
   
}
     //Actor count = (Basketball)getObjectsAt(600, 550, Basketball.class);
        
 
    

