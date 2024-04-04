package module._303.example.tek_fileIO_main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TxtWriter {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("feedback2.txt"))) {
            writer.write("Customer ID: 12345 \n");
            writer.write("Feedback: Excellent service and fast delivery\n");
            writer.write("Rating 5/5\n");
            writer.write("Would Recommend\n");
            writer.write("5 star service\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
