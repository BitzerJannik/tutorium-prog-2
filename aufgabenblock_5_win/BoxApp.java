public class BoxApp {
    public static void main (String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hallo");
        System.out.println(stringBox.getContent());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(1);
        System.out.println(integerBox.getContent());
    }
}