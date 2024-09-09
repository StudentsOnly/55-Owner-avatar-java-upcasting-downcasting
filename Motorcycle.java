public class Motorcycle extends Vehicle {
    private boolean hasWindShield;

    public Motorcycle(String brand, String model, int year, boolean hasWindShield) {
        super(brand, model, year, 2);
        this.hasWindShield = hasWindShield;
    }

    public boolean isHasWindShield() {
        return hasWindShield;
    }

    public void setHasWindShield(boolean hasWindShield) {
        this.hasWindShield = hasWindShield;
    }
}
