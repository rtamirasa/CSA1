import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person extends Actor
{
     
     private static final int INFECTION_TIME = 200;
     private int infection = 0;
     private boolean isImmune = false;
    /** Creating a person with random direction of movement.
         */
    public person()
    {
        turn(Greenfoot.getRandomNumber(360));
    }
    
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        if(isInfected()){
            infectOthers();
            heal();
    }
    
}
    
     
    //move person randomly on screen
    private void move()
        {
        move(3);
        if (isAtEdge()) {
            turn(87);
        }       
    if (Greenfoot.getRandomNumber(1000) <20) {
        turn(Greenfoot.getRandomNumber(60)-30);
    }
      
}

/**check wether we are touching, if we are infect
 * 
 */private void infectOthers()
{
    person other = (person)getOneIntersectingObject(person.class);
    
    if (other != null) {
        other.infect();
}
}
 public void infect()
{  
    if (!isImmune){
    infection = INFECTION_TIME;
    setImage(new GreenfootImage("ppl3.png"));
    isImmune = true;
}
}

private boolean isInfected(){
 return infection > 0;
}
public void heal(){
 if (infection > 0){
     infection--;
     if (infection == 0) {
         setImage(new GreenfootImage("ppl2.png"));
        }

      }
   }
}


