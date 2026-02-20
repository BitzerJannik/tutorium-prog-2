public class Bus extends Vehicle implements Maintainable, Ticketable {
    private int power;
    private String fuelType;

    public Bus() {}

    public Bus(int vehicleId, int capacity, boolean inService, int power, String fuelType) {
        super(vehicleId, capacity, inService);
        this.power = power;
        this.fuelType = fuelType;
    }

    public Bus(Bus other) {
        super(other);
        this.power = power;
        this.fuelType = other.fuelType;
    }

    public int getPower (){
        return this.power;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setfuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void maintain() {
        System.out.println("Bus " + vehicleId + " is under maintenance.");
    }

    @Override
    public void sellTicket() {
        System.out.println("Ticket sold for Bus " + vehicleId);
    }

    @Override
    public String toString() {
        return "Bus (vehicleId: " + this.vehicleId + ", capacity: " + this.capacity + ", inService:" + this.inService + ", power: " + this.power + ", fuelType: " + this.fuelType + ")";
    }
}