import factorydesignpattern.BikeFactory;
import factorydesignpattern.CarFactory;
import factorydesignpattern.Vehicle;
import factorydesignpattern.VehicleFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Factory Method example */
        VehicleFactory vehicleFactory = new BikeFactory();
        Client bikeClient = new Client(vehicleFactory);
        Vehicle bike = bikeClient.getVehicle();
        System.out.println(bike.type());

        VehicleFactory vehicleFactory1 = new CarFactory();
        Client carClient = new Client(vehicleFactory1);
        Vehicle car = carClient.getVehicle();
        System.out.println(car.type());



    }
}