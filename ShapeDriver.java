import java.util.ArrayList;
/**
 * @author: Adam Aguirre
 * Date: 2/4/21
 * Assignment 4
 */
public class ShapeDriver{
    public static void main(String[] args){
        ArrayList<AbstractShape> shapes = new ArrayList<>();

        //creates a Rectanle, Circle and Triangel and then adds them to the ArrayList
        shapes.add(new MyRectangle(100, 100, 150, 75));
        shapes.add(new MyCircle(200, 200, 50));
        shapes.add(new MyTriangle(300, 300, 150, 75));
        shapes.add(new MySquare(400, 400, 50));

        /* Uses a for each loop to cycle through the array list
        *  Then checks if the abstract shap is an instance of a Rectangle, Circle or Triangle
        *  Cast the object down to call the special getCalc method of for each class
        */
        for (AbstractShape aS : shapes) {
            if (aS instanceof MyRectangle) {
                System.out.printf("%s\nArea: %,.2f\n%s\n\n", aS.toString(), aS.getArea(), ((MyRectangle) aS).getRectCalc());
            }
            if (aS instanceof MyCircle) {
                System.out.printf("%s\nArea: %,.2f\n%s\n\n", aS.toString(), aS.getArea(), ((MyCircle) aS).getCirCalc());
            }
            if (aS instanceof MyTriangle) {
                System.out.printf("%s\nArea: %,.2f\n%s\n\n", aS.toString(), aS.getArea(), ((MyTriangle) aS).getTriCalc());   
            }
            if (aS instanceof MySquare) {
                System.out.printf("%s\nArea: %,.2f\n%s\n\n", aS.toString(), aS.getArea(), ((MySquare) aS).getSqrCalc());   
            }
        }
        System.out.println("Total Shapes: " + shapes.size());

        for (AbstractShape abstractShape : shapes) {
            abstractShape.stretchBy(.1); 
            abstractShape.move(400, 400);         
        }
        shapes.forEach((s) -> System.out.println(s.toString()));
    }
}
