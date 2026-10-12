class Area {

    static void rectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    void squareArea(int side) {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }
}

public class Rec {
    public static void main(String[] args) {

        Area.rectangleArea(10, 5);

        Area obj = new Area();
        obj.squareArea(5);
    }
}