public class Main{
    public static void main(String[] args) {
        Vehicle vehicleCar = new Car();
        Vehicle vehicleMotorcycle = new Motorcycle();

        vehicleCar.startEngine();
        vehicleMotorcycle.startEngine();


        Car car = (Car) vehicleCar;
        System.out.println(car.doors);

        Motorcycle motorcycle = (Motorcycle) vehicleMotorcycle;
        System.out.println(motorcycle.wheels);

    }
}
