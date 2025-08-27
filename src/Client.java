import patterns.factorydesignpattern.Vehicle;
import patterns.factorydesignpattern.VehicleFactory;

public class Client {

    private final Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory)
    {
        vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }

}
