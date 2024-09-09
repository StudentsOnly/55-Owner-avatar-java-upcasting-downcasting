public class Vehicle {

    private String brand;
    private String model;
    private int year;
    private int wheels;

    public Vehicle(String brand, String model, int year, int wheels) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
    }

    public void startEngine() {
        System.out.println("Vehicle started engine");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
