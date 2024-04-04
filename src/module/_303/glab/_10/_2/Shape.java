package module._303.glab._10._2;

public class Shape {
    protected double area = 1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;
    private String color;

    /**
     * Constructs a Shape instance with only the given color
     */
    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    /**
     * Constructs a Shape instance with the given values
     */
    public Shape(String color, double area, double base, double width, double height) {
        this.color = color;
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    /**
     * All shapes must provide a method called getArea()
     */
    public double getArea() {
        // We have a problem here!
        // We need to return some value to compile the program.
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void displayshapName() {
        System.out.println("I am a Shape.");
    }
}
