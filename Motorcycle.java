class Motorcycle extends Vehicle {

    boolean hasSidecar; // specific variable for Motorcycle

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    // Unique method for Motorcycle
    public void turbo() {
        System.out.println("Forcing Turbo mode " + model);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle with sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}