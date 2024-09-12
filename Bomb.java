import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Actor
{
    public void act()
    {
        // Add your action code here.
        move(-3);
        
        if(getX() <= 0)
        {
            resetBomb();
        }
        
        if(isTouching(Hero.class))
        {
            //Add a gameover symbol
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this); 
        }
    }
    
    public void resetBomb()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
    }
}
