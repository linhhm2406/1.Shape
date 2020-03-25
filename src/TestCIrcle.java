public class TestCIrcle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.0);
        System.out.println(circle);

        circle = new Circle("red",true,2.0);
        System.out.println(circle);
    }
}
