# AguirreAssignment04

For this assignment you will make a Abstract Program. You will be creating 1 abstract class and 4 additional classes for this assignment.  Here are some of the requirements: (use the following UML class diagram)

UML2.PNG      

AbstractShape

    Create the field variables according to the diagram
    You will create a counter variable and getter that are static
    Create an abstract method getArea() according to the diagram
    Create a constructor
    A toString is not required
    Create getters / setters for the field variables

MyRectangle

    Extend AbstractShape
    Create the field variables according to the diagram
    Create a constructor
    Use the inherited abstract method getArea() to calculate the area
    Create a new method called getRectCalc() and return a String according to the sample session
    Create a toString and getters / setters for the new fields

MyCircle

    Extend AbstractShape
    Create the field variables according to the diagram
    Create a constructor
    Use the inherited abstract method getArea() to calculate the area
    Create a new method called getCirCalc() and return a String according to the sample session
    Create a toString and getters / setters for the new fields

MyTriangle

    Extend AbstractShape
    Create the field variables according to the diagram
    Create a constructor
    Use the inherited abstract method getArea() to calculate the area
    Create a new method called getTriCalc() and return a String according to the sample session
    Create a toString and getters / setters for the new fields

ShapesDriver

    Use main method / no constructor needed
    Create an ArrayList named shapes
    Instantiate 1 Rectangle, 1 Circle, and 1 Triangle from your classes
    Add all three shapes to your shapes array
    Create a for-each loop (enhanced)
    For each iteration print the toString() and the getArea() method as shown in the sample session.
    When you get the number back from your get area method, use the printf instead of println.  This is the only way to get the comma in the number. Don't use decimal format for this.  "%,f" will get you the number with a comma.  You must add something to get to two decimals.  (this was added)
    Each class has a unique method. You will need to use an if statement with the instanceof command to find the appropriate class
    In your if statement, cast the AbstractShape object down to the appropriate concrete class then call the unique method of that class
    After your loop has run three times printing the information, print the total number of shapes as shown in the sample session

Data Required

See UML

Methods Required

See UML

Analysis

The requirements were broken down above; here is a short list:

1) Make the Abstract Class

2) Make all three concrete classes that extend AbstractShape

3) Make the ShapeDriver class that puts all three shapes in an ArrayList

4) Print the toString() and getArea() methods in a loop

5) Cast the classes as necessary and print the unique method for each class

6) Print the total number of shapes

Sample Session: When you run the ShapesDriver class your terminal output should look like this

MyRectangle [width=150.0, length=75.0, xPos=100, yPos=100]
Area: 11,250.00
Multiply width * length

MyCircle [radius=50, xPos=200, yPos=200]
Area: 7,853.98
Multiply Math.PI * Radius Squared

MyTriangle [base=150.0, height=75.0, xPos=300, yPos=300]
Area: 5,625.00
Multiply Base * Height / 2

Total Shapes: 3

Deliverable

For this assignment, you will need to zip your five files up in one .zip file.  Your file name should be <lastnameAssignment04.zip> You will only submit your ZIP file.  Your output should match mine exactly. Use my session example for the parameters to pass to your constructor.

Documentation

Make sure that you use comments for  all assignments.  As a minimum you should have comments for Author, Date, and Notes. Put this above your code and above the class declaration.

Not applicable for this assignment. Name it Student.java

Attach the.zip file and submit the program through Canvas.

NOTE: Proper indentation, commenting, Java programming conventions, and general readability are an important part of programming that can set apart a good programmer from an excellent programmer. Part of your score on each assignment (approximately 10%) will be based on those readability elements.
