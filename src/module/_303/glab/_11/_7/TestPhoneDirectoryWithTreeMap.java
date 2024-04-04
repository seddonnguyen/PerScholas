package module._303.glab._11._7;

public class TestPhoneDirectoryWithTreeMap {
    public static void main(String[] args) {
        PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
        System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
        System.out.println("adds several entries.  It then prints the contents of");
        System.out.println("directory and does a few lookups.");
        System.out.println();

        directory.putNumber("Fred", "555-1234");
        directory.putNumber("Barney", "555-2345");
        directory.putNumber("Wilma", "555-3456");
        directory.putNumber("Wilma", "555-3456");
        directory.putNumber("Wilma", "555-2563");
        // directory.putNumber("James", null);
        // directory.putNumber(null, "555-2563");

        System.out.println("Contents of directory:");
        System.out.println();
        directory.print();
        System.out.println();

        System.out.println(STR."Number for Fred is \{directory.getNumber("Fred")}");
        System.out.println(STR."Number for Wilma is \{directory.getNumber("Wilma")}");
        System.out.println(STR."Number for Tom is \{directory.getNumber("Tom")}");
        System.out.println(STR."Number for Tom is \{directory.getNumber("Alex")}");
    }
}
