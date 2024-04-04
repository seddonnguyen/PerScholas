package module._303.glab._11._3;

public class Book {
    private int number;
    private String name;
    private String author;
    private String category;

    // Constructor with arguments
    public Book(int number, String name, String author, String category) {
        this.number = number;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    // Constructor without arguments
    public Book() {
        this.number = 0;
        this.name = "";
        this.author = "";
        this.category = "";
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
