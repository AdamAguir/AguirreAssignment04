public class MyTriangle extends AbstractShape{
    
    private double base;
    private double height;

    public MyTriangle(int x, int y, double b, double h){
        super(x, y);
        base = b;
        height = h;
    }

    public String getTriCalc(){
        return "Multiply (base * height) / 2";
    }

    //getters and setters
    public void setBase(double b){
        base = b;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }

    @Override
    public double getArea() {
        return .5 * (base * height);
    }
    @Override
    public String toString() {
        return "MyTriangle [base=" + base + ", height=" + height + ", xPos=" + getxPos() + ", yPos=" + getyPos() + "]";
    }

    
}
