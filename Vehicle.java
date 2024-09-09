public class Vehicle {
    String brand;
    String model;
    int year;

    public void startEngine() {
        System.out.println("Starting vehicle engine");
    }
}

class Car extends Vehicle {
    int doors = 4;
}

class Motorcycle extends Vehicle {
    int wheels = 2;
}

