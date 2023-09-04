package OOP.Interfaces;

//Polymorphism = many forms
public class Main {
    public static void main(String[] args) {

        System.out.println(1+1);        // 2, here adding two primitives
        System.out.println("1"+"1");    // 11 , here concatenating two strings

        //Polymorphism = many forms
            // Car - move, break, getCurrentSpeed
            // Bicycle - move, break, getCurrentSpeed
            // Electric Scooter - move, break, getCurrentSpeed
            // Vehicles

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter scooter = new ElectricScooter();

        Vehicle[] vehicles = {car,bicycle, scooter};

        Person person = new Person("John",vehicles);

        for (Vehicle vehicle : person.getVehicles()) {
            vehicle.move(10);   //that methods have many forms
            System.out.println(vehicle.getCurrentSpeed());
            System.out.println();
        }
        System.out.println("purchase rate: "+Vehicle.PURCHASE_RATE);

        System.out.println(car.milesToKm(car.getCurrentSpeed()));
        System.out.println(bicycle.milesToKm(bicycle.getCurrentSpeed()));

    }
}
