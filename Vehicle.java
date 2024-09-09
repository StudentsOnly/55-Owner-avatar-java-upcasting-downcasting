class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println(brand + " " + model + " (" + year + ") engine is starting...");
    }

    public void displayInfo() {
        System.out.println("Vehicle Info: " + brand + " " + model + " (" + year + ")");
    }
}