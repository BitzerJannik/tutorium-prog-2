
public class Component {
    private int id;
    private int serial;
    private String name;
    private String producer;
    private boolean condition;

    public Component () {}

    public Component (int id, int serial, String name, String producer, boolean condition) {
        this.id = id;
        this.serial = serial;
        this.name = name;
        this.producer = producer;
        this.condition = condition;
    }

    public Component (Component other) {
        this.id = other.id;
        this.serial = other.serial;
        this.name = other.name;
        this.producer = other.producer;
        this.condition = other.condition;
    }

    public int getId () {
        return this.id;
    }

    public int getSerial () {
        return this.serial;
    }

    public String getName () {
        return this.name;
    }

    public String getProducer () {
        return this.producer;
    }

    public boolean getCondition () {
        return this.condition;
    }

    public void setCondition (boolean condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object obj) {
        Component other = (Component) obj;
        return this.id == other.id 
               && this.serial == other.serial
               && this.name == other.name 
               && this.producer == other.producer
               && this.condition == other.condition;
    }

    public String toString () {
        return "Component ( id: " + this.id + ", serial: " + this.serial + ", name: " + this.name + ", producer: " + this.producer + ", condition: " + this.condition + " )";
    }

}
