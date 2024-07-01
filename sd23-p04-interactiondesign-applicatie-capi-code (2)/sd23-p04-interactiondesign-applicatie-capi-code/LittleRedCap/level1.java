import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{
    public static int score = 0; 
    private int timer = 4500;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void act()
    {
        showText("Score = "+ score , 50, 25);
        timer--;
        showText("Timer: "+timer, 50, 50);
        if(score>=3){
            addObject(new Home(), 160,160);
        }
        if(timer <= 0){
            Greenfoot.stop();
        }
    }
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score=0;
        LittleRed littleRed = new LittleRed();
        addObject(littleRed,459,384);
        Flower flower = new Flower();
        addObject(flower,183,255);
        Flower flower2 = new Flower();
        addObject(flower2,576,206);
        Flower flower3 = new Flower();
        addObject(flower3,369,216);
        Flower flower4 = new Flower();
        addObject(flower4,282,100);
        Flower flower5 = new Flower();
        addObject(flower5,477,139);
        Flower flower6 = new Flower();
        addObject(flower6,175,560);
        Flower flower7 = new Flower();
        addObject(flower7,328,558);
        Flower flower8 = new Flower();
        addObject(flower8,279,386);
        Flower flower9 = new Flower();
        addObject(flower9,665,366);
        Flower flower10 = new Flower();
        addObject(flower10,655,254);
        Flower flower11 = new Flower();
        addObject(flower11,597,493);
        Flower flower12 = new Flower();
        addObject(flower12,697,421);
        Flower flower13 = new Flower();
        addObject(flower13,539,533);
        Flower flower14 = new Flower();
        addObject(flower14,441,533);
        Flower flower15 = new Flower();
        addObject(flower15,688,633);
        Flower flower16 = new Flower();
        addObject(flower16,504,697);
        Flower flower17 = new Flower();
        addObject(flower17,24,433);
        Flower flower18 = new Flower();
        addObject(flower18,187,376);
        Flower flower19 = new Flower();
        addObject(flower19,686,294);
        Flower flower20 = new Flower();
        addObject(flower20,585,356);
        Flower flower21 = new Flower();
        addObject(flower21,263,686);
    }
}
