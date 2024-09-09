public class Car extends Vehicle{

     int doors;

    public Car(String brand, String model, int year, int doors){
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void startEngine(){
        System.out.println("Start engine: car");
    }
}
