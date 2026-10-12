class Circle {
    double radius;

   
    Circle(double radius) {
        this.radius = radius;
    }

   
    void setRadius(double radius) {
        this.radius = radius;
    }

   
    double getRadius() {
        return radius;
    }

    
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {

        Circle c = new Circle(5);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());

        
        c.setRadius(10);

        System.out.println("\nAfter modifying radius:");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());
    }
}