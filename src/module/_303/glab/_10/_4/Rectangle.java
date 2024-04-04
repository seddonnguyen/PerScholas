package module._303.glab._10._4;

public class Rectangle extends Shape implements Movable {
    /**
     * Constructs a MovablePoint instance at the given x and y
     */
    private int x, y;   // x and y coordinates of the point

    public Rectangle(String color) {
        super.color = color;
    }
    public Rectangle(double height, double width) {
        this("Orange");
        super.height = height;
        super.width = width;
    }
    public Rectangle(int x, int y, double height, double width) {
        this(height, width);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return super.height * super.width;
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a Rectangle of an Area: " + this.getArea());
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return "Rectangle [ Area = " + this.getArea() + " " + super.toString() + "] ";
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
