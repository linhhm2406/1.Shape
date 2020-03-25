public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(10,20);
        System.out.println(rectangle);

        rectangle = new Rectangle("red",true,10,20);
        System.out.println(rectangle);
    }
}
