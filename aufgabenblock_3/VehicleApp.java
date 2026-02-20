import java.util.ArrayList;

public class VehicleApp {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Train(1, 400, true, 429, 8000, 330, "ICE3", "Stuttgart-Berlin"));
        vehicles.add(new Bus(2, 50, true, 44, "Diesel"));
        vehicles.add(new Tram(3, 120, false, 4));

        VehicleWriteable.write("vehicles.txt", vehicles);

        ArrayList<Vehicle> loadedVehicles = VehicleReadable.read("vehicles.txt");

        for (Vehicle vehicle : loadedVehicles) {
            System.out.println(vehicle);
        }
    }
}
