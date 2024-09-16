class Car extends Vehicle {

    int numberOfDoors; // specific variable for Car

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        if (numberOfDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be a positive integer.");
        }
        this.numberOfDoors = numberOfDoors;
    }

    // Unique method for Car
    public void openTrunk() {
        System.out.println("Opening the trunk of the " + model);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car with " + numberOfDoors + " doors.");
    }
}