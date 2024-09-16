class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty.");
        }
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        if (year < 1886 || year > 2024) {
            throw new IllegalArgumentException("Year must be between 1886 and the current year.");
        }
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