/**
 * @author: Adam Aguirre
 * Date: 2/3/21
 * Assignment 3
 */

public abstract class AbstractShape{

    protected int xPos;
    protected int yPos;
    private static int shapeCount = 0;

    protected AbstractShape(int x, int y){
        xPos = x;
        yPos = y;
        setShapeCount(shapeCount+1);
    }
    //abstract method
    public abstract double getArea();

    // getters and setters
    public int getxPos(){
        return xPos;
    }
    public int getyPos(){
        return yPos;
    }
    public int getShapeCount(){
        return shapeCount;
    }
    public void setxPos(int x){
        xPos = x;
    }
    public void setyPos(int y){
        yPos = y;
    }
    public static void setShapeCount(int sc){
        shapeCount = sc;
    }
}
