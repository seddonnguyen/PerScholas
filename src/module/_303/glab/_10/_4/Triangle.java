package module._303.glab._10._4;

public class Triangle extends Shape implements Movable {
    /**
     * Constructs a MovablePoint instance at the given x and y
     */
    private int x, y;   // x and y coordinates of the point

    public Triangle(String color) {
        super.color = color;
    }
    public Triangle(double height, double base) {
        this("Purple");
        super.height = height;
        super.base = base;
    }
    public Triangle(int x, int y, double height, double base) {
        this(height, base);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return super.height * super.base * 0.5;
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Triangle of an Area: " + this.getArea());
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return "Triangle [ Area = " + this.getArea() + " " + super.toString() + "] ";
    }

    // Need to implement all the abstract methods defined in the interface Movable
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }
}
