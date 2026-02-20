
public class WarehouseApp {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(10);

        for (int i = 0; i < 5; i++) {
            Component c = new Component( i, 100+ i, "Teil " + i, "Hersteller " + i, true);
            warehouse.receiveItem(c);
        }

        warehouse.printInventory();

        Component picked = warehouse.pickItem(warehouse.stock.get(0));
        System.out.println("Entnommen: " + picked);

        picked.setCondition(true);
        warehouse.returnItem(picked);

        warehouse.printInventoryDetailed();
    }
}
