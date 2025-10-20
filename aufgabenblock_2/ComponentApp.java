
public class ComponentApp {
    public static void main (String[] args) {
        Component c1 = new Component();
        Component c2 = new Component(1, 123, "Schwungscheibe", "Bosch", true);
        Component c3 = new Component(c2);

        Component [] components = new Component[3];

        components[0] = c1;
        components[1] = c2;
        components[2] = c3;

        for (int i=0; i < components.length; i++) {
            Component component = components[i];
            System.out.println(component.toString());
            System.out.println("getId() " + component.getId());
            System.out.println("getSerial() " + component.getSerial());
            System.out.println("getName() " + component.getName());
            System.out.println("getProducer() " + component.getProducer());
            System.out.println("getCondition " + component.getCondition());

            component.setCondition(false);

            System.out.println(component.getCondition());
        }
    }
}
