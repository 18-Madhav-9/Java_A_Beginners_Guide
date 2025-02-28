/* 
implement subclass of TwoDShape called Circle. Include an area( ) method that computes
the area of the circle and a constructor that uses super to initialize the TwoDShape portion.
*/

class TwoDShape {
    private double width ;
    private double height ;
    private String name ;

    // A default constructor.
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }
    // Parameterized constructor.
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Construct object with equal width and height.
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Construct an object from an object.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }


    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }
    void showDim() {
        System.out.println("Width and height are " +width + " and " + height);
    }
    
    // Now, area() is abstract.
    abstract double area();

}


class Circle extends TwoDShape {

    private double radius;

    Circle(double r , String n ) {
        super(2*r,n) ; // initiliazing using twoDShape constructor with same width and heigth
        radius = r  ; // as in circle width and heigth are same equal to double the radius 

    }
    
    // overriding the abstract method for circle 
    double area() { 
        return (double) (radius * radius * (22/7) ) ;
    }
    
    //accessor method for radius 
    double getRadius() {
        return radius ;
    }
    void serRadius(double r) {
        radius = r ;
    }

}

public class SelfTestSeven_Circle {
    public static void main(String[] args) {
        Circle cir = new Circle(3.14 , "Cirlce 1 ") ;
        
        System.out.println( "Name of the object : " + cir.getName() ) ;
        System.out.println("Area of the object : " + cir.area() ) ;
        System.out.println("radius of the object : " + cir.getRadius() ) ;

    }
}
