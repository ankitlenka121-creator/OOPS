class Vehicle {

    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Car c = new Car();

        c.drive();
    }
}