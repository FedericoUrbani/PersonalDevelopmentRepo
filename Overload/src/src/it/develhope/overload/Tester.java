package src.it.develhope.overload;

public class Tester {
    public static void main(String[] args) {

        Shape shape= new Shape();
        Shape circle=new Shape(4.5);
        Shape square=new Shape(4,17.1);
        Shape rectangle=new Shape(4,4.0,8.0);
        Shape triangle=new Shape(3,2.0,2.0,3.0);

        shape.getShapeDetails();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();
    }
}