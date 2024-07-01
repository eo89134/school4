import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LittleRed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LittleRed extends Actor
{
    /**
     * Act - do whatever the LittleRed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act()
    {
        //showText("Score = "+ score , 50, 25);
        moveAround();
        hitFlower();
        hitHome();
        hitWall();
        hitBlueFlower();
        hitEnemy();
    }
    public void hitFlower()
    {
        Actor flower = getOneIntersectingObject(Flower.class);
        if(flower != null){
            getWorld().removeObject(flower);
            level1.score++;
        }
    }
    public void hitHome()
    {
        Actor home = getOneIntersectingObject(Home.class);
        if(home != null){
            if(getWorldOfType(level1.class)!=null)
            {
               getWorldOfType(level1.class).score = 0; 
               Greenfoot.setWorld(new level2()); 
            } else {
                getWorldOfType(level2.class).addObject(new Winner(),400, 400);
                setImage("winner.jpg");
                Greenfoot.stop();
            }
        }
    }
    private void moveAround(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-1);
            setImage("redcapbehind2.gif");
                        if(hitWall() == true || hitEdge() == true){
                setLocation(getX(), getY()+2);
            }
            //if(hitHome() == true){
            //    World level2 = new FishWorld();
            //    Greenfoot.setWorld(level2);
            //}
        }
        else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+1);
            setImage("redcapbehind2.gif");
            if(hitWall() == true || hitEdge() == true){
            setLocation(getX(), getY()-2);
        }
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-1, getY());
            setImage("redcapbehind2.gif");
            if(hitWall() == true || hitEdge() == true){
            setLocation(getX()+2, getY());
        }
        }
        else if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+1, getY());
            setImage("redcapbehind2.gif");
            if(hitWall() == true || hitEdge() == true){
            setLocation(getX()-2, getY());
        }
        }
    }
    public boolean hitWall(){
       if(isTouching(Wall.class)){
           return true;
       }
       else{
        return false;
        }
    }
        public boolean hitEdge(){
        int getX = getX();
        int getY = getY();
        if(getX <= 10|| getX >=590|| getY <= 15|| getY >= 585  ){
            return true;
        }
        else{
            return false;
        }
    }
    public void hitBlueFlower()
    {
        Actor blueflower = getOneIntersectingObject(blueFlower.class);
        if(blueflower != null){
            getWorld().removeObject(blueflower);
            level2.score++;
        }
    }
     public void hitEnemy(){
       Actor Enemy = getOneIntersectingObject(Enemy.class);
       if(Enemy != null){
           getWorld().removeObject(Enemy);
           level2.score--;
        }
       
    }

}
