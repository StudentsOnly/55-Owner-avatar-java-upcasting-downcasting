public class Motorcycle extends Vehicle{

     int wheels;

    public Motorcycle(String brand, String model, int year, int wheels){
        super(brand, model, year);
        this.wheels = wheels;
    }

    @Override
    public void startEngine(){
        System.out.println("Start engine: motorcycle");
    }
}
