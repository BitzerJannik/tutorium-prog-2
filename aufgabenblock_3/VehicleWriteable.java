import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class VehicleWriteable {
    public static void write(String filename, ArrayList<Vehicle> vehicles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle instanceof Train) {
                    Train train = (Train) vehicle;
                    bw.write("Train#" + train.getVehicleId() + "#" + train.getCapacity() + "#" + train.isInService() +
                             "#" + train.getWagonCount() + "#" + train.getPower() + "#" + train.getMaxSpeed() +
                             "#" + train.getModel() + "#" + train.getRoute() + "\n");
                } else if (vehicle instanceof Bus) {
                    Bus bus = (Bus) vehicle;
                    bw.write("Bus#" + bus.getVehicleId() + "#" + bus.getCapacity() + "#" + bus.isInService() +
                             "#" + bus.getPower() + "#" + bus.getFuelType() + "\n");
                } else if (vehicle instanceof Tram) {
                    Tram tram = (Tram) vehicle;
                    bw.write("Tram#" + tram.getVehicleId() + "#" + tram.getCapacity() + "#" + tram.isInService() +
                             "#" + tram.getLineNumber() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
