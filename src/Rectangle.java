public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.getHeight()*this.getWidth();
    }

    public double getPerimeter(){
        return (this.getHeight()+this.getWidth())*2;
    }

    @Override
    public String toString (){
        return "A Rectangle with width="+this.getWidth()
                + " and length="+this.getHeight()
                + ", which is a subclass of "+ super.toString();
    }
}
