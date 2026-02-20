public class Train extends Vehicle implements Maintainable, Ticketable, ElectricPowered, RailBound {
    private int wagonCount;
    private int power;
    private int maxSpeed;
    private String model;
    private String route;

    public Train () {}

    public Train(int vehicleId, int capacity, boolean inService, int wagonCount, int power, int maxSpeed, String model, String route) {
        super(vehicleId, capacity, inService);
        this.wagonCount = wagonCount;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.route = route;
    }

    public Train(Train other) {
        super(other);
        this.wagonCount = other.wagonCount;
        this.power = other.power;
        this.maxSpeed = other.maxSpeed;
        this.model = other.model;
        this.route = other.route;
    }

    public int getWagonCount() {
        return this.wagonCount;
    }

    public int getPower() {
        return this.power;
    }

    public int getMaxSpeed () {
        return this.maxSpeed;
    }

    public String getModel() {
        return this.model;
    }

    public String getRoute() {
        return this.route;
    }

    public void setWagonCount (int wagonCount) {
        this.wagonCount = wagonCount;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMaxSpeed (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setRoute (String route) {
        this.route = route;
    }

    @Override
    public void maintain() {
        System.out.println("Train " + vehicleId + " is under maintenance.");
    }

    @Override
    public void sellTicket () {
        System.out.println("Ticket sold for Train " + vehicleId);
    }

    @Override
    public void charge() {
        System.out.println("Train " + vehicleId + " is charging.");
    }

    @Override
    public void runOnRails() {
        System.out.println("Train " + vehicleId + " is running on rails.");
    }

    @Override
    public String toString() {
        return "Train (vehicleId: " + this.vehicleId + ", capacity: " + this.capacity + ", inService: " + this.inService + ", wagonCount: " + this.wagonCount + ", power:" + this.power + ",maxSpeed: " + this.maxSpeed + ", model: " + this.model + ", route: " + this.route + ")";
    }
}