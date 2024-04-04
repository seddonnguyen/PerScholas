package module._303.example.tek_fileIO_main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("products.json"))) {
            writer.write("{\"productID\": 101, \"name\": \"laptop\", \"price\": 1200.00\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
