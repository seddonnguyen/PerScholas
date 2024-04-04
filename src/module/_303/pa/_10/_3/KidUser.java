package module._303.pa._10._3;

public class KidUser implements LibraryUser {
    int age;
    String bookType;

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account.");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days.");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
