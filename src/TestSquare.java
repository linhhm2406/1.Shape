public class TestSquare {
    public static void main(String[] args) {
        Rectangle sq1 = new Square(5);
        System.out.println(sq1);

        Square square = new Square();
        System.out.println(square);

        square = new Square(10);
        System.out.println(square);

        square = new Square(10, "red",false);
        System.out.println(square);
    }

}
