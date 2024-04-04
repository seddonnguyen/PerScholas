package module._303.glab._10._1;

public class Person {
    static int lifeSpan = 60;
    static double ageFactor = 1.0;
    String name;

    public Person() {

        name = "";
    }

    public Person(String aName) {
        name = aName;
    }

    public static double lifeSpan() {
        return (lifeSpan * ageFactor);
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String toString() {
        return ("Hello, my name is " + name);
    }

    public String talk() {
        return ("I have nothing to say.");
    }

    public String walk() {
        return ("I have nowhere to go.");
    }
}
