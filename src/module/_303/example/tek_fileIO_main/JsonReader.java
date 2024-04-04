package module._303.example.tek_fileIO_main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("products.json"))) {
            String line = reader.readLine();

            System.out.println("Json content : " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
