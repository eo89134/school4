import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
    public static int score = 0; 
    private int timer = 3500; 
    /**
     * Constructor for objects of class level2.
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
    public level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LittleRed littleRed = new LittleRed();
        addObject(littleRed,254,339);
        int y = 25;
        int x = 25;        
        int[][] maze = 
            {
                {1, 1, 1, 1, 0, 2, 1, 0, 0, 0, 1, 0},
                {Greenfoot.getRandomNumber(2)+2, 0, 0, 1, 0, 1, 1, 0, 1, Greenfoot.getRandomNumber(2)+2, 1, 0},
                {1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0},
                {Greenfoot.getRandomNumber(2)+2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1},
                {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 1, 0, 1, 2, 1, 0},
                {0, 1, 1, 1, 0, 1, 1, 0, Greenfoot.getRandomNumber(2)+2, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, Greenfoot.getRandomNumber(2)+2},
                {Greenfoot.getRandomNumber(2)+2, 1, 0, 1, 0, 1, 1, 0, 0, 1, Greenfoot.getRandomNumber(2)+2, 0},
                {1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0},
                {0, 0, 0, Greenfoot.getRandomNumber(2)+2, 0, Greenfoot.getRandomNumber(2)+2, 1, 0, 0, 0, 0, 0},

            };
        for(int i=0; i<maze.length; i++) {
            x = 25;
            for(int j=0; j<maze[i].length; j++) {  
                if(maze[i][j] == 1){
                    addObject(new Wall(),x,y);
                }
                else if(maze[i][j] == 2){
                    addObject(new blueFlower(),x,y);
                }  
                else if(maze[i][j] == 3){
                    addObject(new Enemy(),x,y);
                }  
                x = x+50;
            }
            y= y+50;
        }

        removeObject(littleRed);
        addObject(littleRed,267,314);
    }
}
