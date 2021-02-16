public class MySquare extends MyRectangle{

    public MySquare(int x, int y, double side){
        super(x, y, side, side);
    }
    public String getSqrCalc() {
        return "Multiply Side * Side";
    }
    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }
    @Override
    public String draw() {
        return "Draws a square";
    }
    @Override
    public void stretchBy(double factor) {
        super.stretchBy(factor);
    }
    @Override
    public String toString() {
        return "MySquare [side=" + super.getLength() + ", xPos=" + super.getxPos() + ", yPos=" + super.getyPos() + "]";
    }
}
