class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }

    double fuelEfficiency() {
        return 0;
    }

    double distanceTraveled(double fuel) {
        return fuel * fuelEfficiency();
    }

    double maximumSpeed() {
        return 0;
    }
}

class Truck extends Vehicle {

    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double fuelEfficiency() {
        return 8;
    }

    @Override
    double maximumSpeed() {
        return 100;
    }
}

class Car extends Vehicle {

    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double fuelEfficiency() {
        return 15;
    }

    @Override
    double maximumSpeed() {
        return 180;
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double fuelEfficiency() {
        return 40;
    }

    @Override
    double maximumSpeed() {
        return 140;
    }
}

public class VehicleHierarchyDemo {
    public static void main(String[] args) {

        Truck truck = new Truck("Tata", "Prima", 2024, "Diesel");
        Car car = new Car("Hyundai", "Creta", 2025, "Petrol");
        Motorcycle bike = new Motorcycle("Honda", "Shine", 2024, "Petrol");

        System.out.println(" TRUCK ");
        truck.displayDetails();
        System.out.println("Fuel Efficiency: " + truck.fuelEfficiency() + " km/l");
        System.out.println("Distance Traveled: "
                + truck.distanceTraveled(50) + " km");
        System.out.println("Maximum Speed: "
                + truck.maximumSpeed() + " km/h");

        System.out.println(" CAR ");
        car.displayDetails();
        System.out.println("Fuel Efficiency: " + car.fuelEfficiency() + " km/l");
        System.out.println("Distance Traveled: "
                + car.distanceTraveled(50) + " km");
        System.out.println("Maximum Speed: "
                + car.maximumSpeed() + " km/h");

        System.out.println(" MOTORCYCLE  ");
        bike.displayDetails();
        System.out.println("Fuel Efficiency: " + bike.fuelEfficiency() + " km/l");
        System.out.println("Distance Traveled: "
                + bike.distanceTraveled(5) + " km");
        System.out.println("Maximum Speed: "
                + bike.maximumSpeed() + " km/h");
    }
}