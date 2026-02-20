public class Tram extends Vehicle implements Maintainable, Ticketable, ElectricPowered, RailBound {
    private int lineNumber;

    public Tram() {}

    public Tram (int vehicleId, int capacity, boolean inService, int lineNumber) {
        super(vehicleId, capacity, inService);
        this.lineNumber = lineNumber;
    }

    public Tram (Tram other) {
        super(other);
        this.lineNumber = other.lineNumber;
    }

    public int getLineNumber () {
        return this.lineNumber;
    }

    public void setLineNumber (int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public void maintain() {
        System.out.println("Tram " + vehicleId + " is under maintenance.");
    }

    @Override
    public void sellTicket () {
        System.out.println("Ticket sold for Tram " + vehicleId);
    }

    @Override
    public void charge() {
        System.out.println("Tram " + vehicleId + " is charging.");
    }

    @Override
    public void runOnRails() {
        System.out.println("Tram " + vehicleId + " is running on rails.");
    }

    @Override
    public String toString() {
        return "Tram (vehicleId: " + this.vehicleId + ", capacity: " + this.capacity + ", inService: " + this.inService + ", lineNumber: " + this.lineNumber + ")";
    }
}