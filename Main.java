public class Main{
    public static void main(String[] args) {

        Vehicle car = new Car("BMW", "316i", 1990, 2);

        Vehicle moto = new Motorcycle("Honda", "CBR600RR", 2023, 2);

        car.startEngine();
        moto.startEngine();
        Car car1 = (Car)car;
        Motorcycle moto1 = (Motorcycle)moto;

        System.out.println(car.brand + "'" + car.model + "' " + car1.year + " has " + car1.doors + " doors");
        System.out.println(moto1.brand + "'" + moto.model + "' " + moto.year + " has " + moto1.wheels + " wheels");

    }
}
