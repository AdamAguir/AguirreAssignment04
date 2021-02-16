/**
 * @author: Adam Aguirre
 * Date: 2/4/21
 * Assignment 4
 */
public class MyCircle extends AbstractShape{
    
    private double rad;

    public MyCircle(int x, int y, double r){
        super(x, y);
        rad = r;
    }
    
    public String getCirCalc(){
        return "Multiply Math.PI * Radius Squared";
    }
    //getters and setters
    public double getRad(){
        return rad;
    }
    public void setRad(double r){
        rad = r;
    }

    @Override
    public double getArea() {
        return (rad * rad * Math.PI);
    }
    @Override
    public String toString() {
        return "MyCircle [Radius=" + rad + ", xPos=" + getxPos() + ", yPos=" + getyPos() + "]";
    }

    @Override
    public void move(int x, int y) {
        super.setxPos(super.getxPos() + x);
        super.setyPos(super.getyPos() + y);
    }

    @Override
    public void stretchBy(double factor) {
        factor = factor + 1;
        setRad(getRad() * factor);
    }

    @Override
    public String draw() {
        return "Draws a circle";
    }
}
