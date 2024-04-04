package module._303.glab._10._1;

public class Girl extends Person {
    static double ageFactor = 1.3;

    public Girl(String aName) {
        name = "Ms." + aName;
    }

    public static double lifeSpan() {
        return (lifeSpan * ageFactor);
    }

    public String talk() {
        return ("Hello! " + jump());
    }

    public String jump() {
        return ("I am jumping.");
    }
}

