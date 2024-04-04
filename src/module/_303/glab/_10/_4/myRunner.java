package module._303.glab._10._4;

public class myRunner {
    public static void main(String[] args) {
        System.out.println("--------Circle-------");
        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Circle Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        System.out.println("Coordinates are " + c2.getCoordinate());

        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());


        System.out.println("--------Rectangle-------");
        Rectangle r1 = new Rectangle(0, 1, 2, 3);
        System.out.println("Area of Rectangle " + r1.getArea());
        System.out.println("Coordinates are " + r1.getCoordinate());

        r1.moveDown();
        System.out.println("After move Down, Coordinates are " + r1.getCoordinate());

        r1.moveRight();
        System.out.println("After move right, Coordinates are " + r1.getCoordinate());

        r1.moveUp();
        System.out.println("After move Up, Coordinates are " + r1.getCoordinate());

        r1.moveLeft();
        System.out.println("After move left, Coordinates are " + r1.getCoordinate());


        System.out.println("--------Test Rectangle Polymorphism-------");
        Movable r2 = new Rectangle(1, 2, 3, 10);  // upcast
        System.out.println("Coordinates are " + r2.getCoordinate());

        r2.moveUp();
        System.out.println("After move up , Coordinates are " + r2.getCoordinate());

        r2.moveLeft();
        System.out.println("After move Left , Coordinates are " + r2.getCoordinate());


        System.out.println("--------Triangle-------");
        Triangle t1 = new Triangle(5, 5, 8, 5);
        System.out.println("Area of Triangle " + t1.getArea());
        System.out.println("Coordinates are " + t1.getCoordinate());

        t1.moveDown();
        System.out.println("After move Down, Coordinates are " + t1.getCoordinate());

        t1.moveRight();
        System.out.println("After move right, Coordinates are " + t1.getCoordinate());

        t1.moveUp();
        System.out.println("After move Up, Coordinates are " + t1.getCoordinate());

        t1.moveLeft();
        System.out.println("After move left, Coordinates are " + t1.getCoordinate());


        System.out.println("--------Test Triangle Polymorphism-------");
        Movable t2 = new Triangle(3, 3, 2, 5);  // upcast
        System.out.println("Coordinates are " + t2.getCoordinate());

        t2.moveUp();
        System.out.println("After move up , Coordinates are " + t2.getCoordinate());

        t2.moveLeft();
        System.out.println("After move Left , Coordinates are " + t2.getCoordinate());
    }
}

