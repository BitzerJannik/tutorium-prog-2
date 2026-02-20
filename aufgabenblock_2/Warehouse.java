import java.util.ArrayList;

public class Warehouse {
    public ArrayList<Component> stock;
    private int capacity;
    private int usage;

    public Warehouse() {
        this.capacity = 150;
        this.stock = new ArrayList<>(capacity);
        this.usage = 0;
    };

    public Warehouse(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>(capacity);
        this.usage = 0;
    }

    public Warehouse( Warehouse other ) {
        this.capacity = other.capacity;
        this.stock = new ArrayList<>(capacity);
        for (int i=0; i < capacity; i++) {
            this.stock.set(i, other.stock.get(i));
        }
        this.usage = other.usage;
    };

    public int getCapacity () {
        return this.capacity;
    }

    public int getUsage () {
        return this.usage;
    }
    
    // checks, if there is enough space for count new items
    private boolean checkSpace (int count){
        return this.getUsage() + count <= this.getCapacity();
    }

    public void receiveItem(Component component) {
        if (this.checkSpace(1)) {
            this.stock.add(component);
            this.usage++;
        } else {
            System.out.println("Das Lager ist voll");
        }
    }
    
    // ueberladen, auf mehrere arten?
    public Component pickItem( Component component) {
        if (this.stock.remove(component)) {
            this.usage--;
            return component;
        }
        System.out.println("Teil nicht gefunden.");
        return null;
    }

    public boolean returnItem(Component component) {
        if (component.getCondition() && this.checkSpace(1)) {
            this.stock.add(component);
            return true;
        }
        System.out.println("Couldn't add component");
        return false;
    };

    public void printInventory() {
        for (int i=0; i < this.stock.size(); i++) {
            Component component = this.stock.get(i);
            System.out.println("Componente name=" + component.getName() );
        }
    }

    public void printInventoryDetailed () {
        for (int i=0; i < this.stock.size(); i++) {
            Component component = this.stock.get(i);
            System.out.println("- " + component.toString());
        }
    }
}
