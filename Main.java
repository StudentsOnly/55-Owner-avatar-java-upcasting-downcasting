public class Main {

    public static void main(String[] args) {

        Car car = new Car("Porsche", "Carrera", 1964,4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Super Cub", 1958, true);

        Vehicle carVehicle = car;
        Vehicle motorcycleVehicle = motorcycle;

        carVehicle.startEngine();
        motorcycleVehicle.startEngine();

        if (carVehicle instanceof Car) {
            Car localCar = (Car) carVehicle;
            System.out.println(localCar.getClass().getSimpleName() + " has " +
                    localCar.getNumberOfDoors() + " doors.");
        }

        if (motorcycleVehicle instanceof Motorcycle) {
            Motorcycle localMotorcycle = Motorcycle.class.cast(motorcycleVehicle);
            System.out.println(localMotorcycle.getClass().getSimpleName() + " has windshield is " +
                    localMotorcycle.isHasWindShield());
        }
    }

}
