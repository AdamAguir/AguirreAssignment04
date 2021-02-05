public class MyCircle extends AbstractShape{
    
    private int rad;

    public MyCircle(int x, int y, int r){
        super(x, y);
        rad = r;
    }
    
    public String getCirCalc(){
        return "Multiply Math.PI * Radius Squared";
    }
    //getters and setters
    public int getRad(){
        return rad;
    }
    public void setRad(int r){
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
}
