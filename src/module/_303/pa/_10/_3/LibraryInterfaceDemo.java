package module._303.pa._10._3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Test case 1: KidUser class");
        KidUser kidUser = new KidUser();
        kidUser.setAge(10);
        kidUser.setBookType("Kids");
        kidUser.registerAccount();
        kidUser.requestBook();

        kidUser.setAge(18);
        kidUser.setBookType("Fiction");
        kidUser.registerAccount();
        kidUser.requestBook();

        System.out.println("Test case 2: AdultUser class");
        AdultUser adultUser = new AdultUser();
        adultUser.setAge(5);
        adultUser.setBookType("Kids");
        adultUser.registerAccount();
        adultUser.requestBook();

        adultUser.setAge(23);
        adultUser.setBookType("Fiction");
        adultUser.registerAccount();
        adultUser.requestBook();
    }
}
