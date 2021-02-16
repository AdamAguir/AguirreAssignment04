/**
 * @author: Adam Aguirre
 * Date: 2/4/21
 * Assignment 4
 */
public class MyRectangle extends AbstractShape{
    private double width;
    private double length;

    public MyRectangle(int x, int y, double w, double l){
        super(x, y);
        width = w;
        length = l;
    }

    public String getRectCalc(){
        return "Multiply width * length";
    }

    //getters and setters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "MyRectangle [Width=" + width + ", length=" + length + ", xPos=" + getxPos() + ", yPos=" + getyPos() + "]";
    }

    @Override
    public void move(int x, int y) {
        super.setxPos(super.getxPos() + x);
        super.setyPos(super.getyPos() + y);

    }

    @Override
    public void stretchBy(double factor) {
        factor = factor + 1;
        setLength(getLength() * factor);
        setWidth(getWidth() * factor);
    }

    @Override
    public String draw() {
        return "Draws Rectangle";
    }

}
