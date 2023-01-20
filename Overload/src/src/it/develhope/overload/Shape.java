package src.it.develhope.overload;

public class Shape {

    String shapename;
    int numberOfEdges;

    public Shape(){
        System.out.println("A shape object has been created");
        this.shapename="undefined";
    }

    public Shape(double radius){
        System.out.println("A circle object has been created");
        this.shapename="circle";
        double circleRadius=radius;
    }

    public Shape(int edges, double edgeLength){
        System.out.println("A square object has been created");
        this.shapename="square";
        this.numberOfEdges=edges;
        double squareEdgeLength=edgeLength;
    }
    public Shape(int edges, double e1, double e2){
        System.out.println("A rectangle object has been created");
        this.shapename="rectangle";
        this.numberOfEdges=4;
        double edge1=e1;
        double edge2=e2;
    }
    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("a triangle object has been created");
        this.shapename="triangle";
        this.numberOfEdges=3;
        double edge1=e1;
        double edge2=e2;
        double edge3=e3;
    }

    public void getShapeDetails(){
        System.out.println("this shape is a "+this.shapename+" and has "+this.numberOfEdges+" edges.");
    }

}
