package module._303.glab._11._3;

import java.util.ArrayList;
import java.util.List;

public class AddDataToArrayList {
    public List<Book> bookdetails() {
        List<Book> list = new ArrayList<>();
        Book b1 = new Book(1, "Death note", "John", "Cartoon");
        Book b2 = new Book(2, "Stranger Things", "brothers", "suspense");
        Book b3 = new Book(3, "Spider man", "Alex", "Kids");
        Book b4 = new Book(4, "GentleMen", "Max", "Action");

        Book b5 = new Book();
        b5.setNumber(5);
        b5.setName("Java FullStack");
        b5.setAuthor("Flex");
        b5.setCategory("Programming");

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        return list;
    }
}
