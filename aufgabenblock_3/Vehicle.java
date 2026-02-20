import java.util.Objects;

public abstract class Vehicle {
    protected int vehicleId;
    protected int capacity;
    protected boolean inService;

    public Vehicle() {}

    public Vehicle(int vehicleId, int capacity, boolean inService) {
        this.vehicleId = vehicleId;
        this.capacity = capacity;
        this.inService = inService;
    }

    public Vehicle(Vehicle other) {
        this.vehicleId = other.vehicleId;
        this.capacity = other.capacity;
        this.inService = other.inService;
    }

    public int getVehicleId() {
        return this.vehicleId;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isInService () {
        return this.inService;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setInService(boolean inService) {
        this.inService = inService;
    }

    @Override
    public String toString() {
        return "Vehicle (vehicleId: " + this.vehicleId + ", capacity: " + this.capacity + ", inService: " + this.inService + ")";
    }
}