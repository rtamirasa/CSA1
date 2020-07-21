import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class basketball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basketball extends Actor

{
    GreenfootSound winner = new GreenfootSound("carti.mp3");
    GreenfootSound backgroundMusic = new GreenfootSound("backsound.mp3");
    
    /**
     * Act - do whatever the basketball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //initialization of the act
    public void act() 
    {
        
    move();
    backgroundMusic.play();      
       }    
    
     private void move()
    {
     
     //ball and player touching and movement
              
      if (isTouching(Player2.class))
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
  
   else if (isTouching(Player.class))
      {        
        if (Greenfoot.isKeyDown("right"))
        { setLocation(getX()+5, getY());
         }
         
        if (Greenfoot.isKeyDown("left"))
        { setLocation(getX()-5, getY());
        }
        if (Greenfoot.isKeyDown("down")){
        setLocation(getX(), getY()+5);
        }
        if (Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-5);
        }
    if (getX() == 590 && getY() == 200){
       getWorld().showText("Green team has won!!",300, 200); 
         backgroundMusic.stop();   
       winner.playLoop();
    }
    if (getX() == 0 && getY() == 200){
       getWorld().showText("Blue team has won!!",300, 200); 
       backgroundMusic.stop();  
       winner.playLoop();
                
    }
  
    
    }
   
}
}




       
 