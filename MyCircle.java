public class MyCircle extends AbstractShape{
    private int rad;

    public MyCircle(int x, int y, int r){

        super(x, y);
        rad = r;
    }
    
    public String getCirCalc(){
        \\TODO
        return null;
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
        
        return (rad * rad * 3.14);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
