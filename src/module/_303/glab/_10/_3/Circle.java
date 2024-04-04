package module._303.glab._10._3;

public class Circle extends Shape {
    private final double PI = Math.PI;
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    public double getArea() {
        //double area = PI * this.radius * this.radius;
        double area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
        return area; //reference to  parent class variable
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }
}
