public class Main{
    public static void main(String[] args) {

        Car car = new Car("Mazda", "CX-30", 2024, 4);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2023, false);


        Vehicle vehicle1 = car;        // Upcasting Car to Vehicle
        Vehicle vehicle2 = motorcycle; // Upcasting Motorcycle to Vehicle


        vehicle1.startEngine(); // Calls Car's startEngine
        vehicle2.startEngine(); // Calls Motorcycle's startEngine

        System.out.println();

        //  no access to Car or Motorcycle-specific methods
        // vehicle1.openTrunk(); // cause an error
        // vehicle2.turbo(); // cause an error

        // Downcasting: Accessing specific features of Car and Motorcycle
        if (vehicle1 instanceof Car) {
            Car specificCar = (Car) vehicle1; // Downcast to Car
            specificCar.openTrunk(); // Now we can access Car-specific method
            specificCar.displayInfo(); // Display car details
        }
        System.out.println();

        if (vehicle2 instanceof Motorcycle) {
            Motorcycle specificMotorcycle = (Motorcycle) vehicle2; // Downcast to Motorcycle
            specificMotorcycle.turbo(); // Now we can access Motorcycle-specific method
            specificMotorcycle.displayInfo(); // Display motorcycle details
        }

        // Downcasting without checking can lead to ClassCastException
        // Car wrongDowncast = (Car) vehicle2; // error at runtime
    }

}
