import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class VehicleReadable {
    public static ArrayList<Vehicle> read(String filename) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("#");
                String type = parts[0];
                int vehicleId = Integer.parseInt(parts[1]);
                int capacity = Integer.parseInt(parts[2]);
                boolean inService = Boolean.parseBoolean(parts[3]);

                switch (type) {
                    case "Train":
                        int wagonCount = Integer.parseInt(parts[4]);
                        int power = Integer.parseInt(parts[5]);
                        int maxSpeed = Integer.parseInt(parts[6]);
                        String model = parts[7];
                        String route = parts[8];
                        vehicles.add(new Train(vehicleId, capacity, inService, wagonCount, power, maxSpeed, model, route));
                        break;
                    case "Bus":
                        power = Integer.parseInt(parts[4]);
                        String fuelType = parts[5];
                        vehicles.add(new Bus(vehicleId, capacity, inService, power, fuelType));
                        break;
                    case "Tram":
                        int lineNumber = Integer.parseInt(parts[4]);
                        vehicles.add(new Tram(vehicleId, capacity, inService, lineNumber));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vehicles;
    }
}
