package module._303.example.tek_fileIO_main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
//                System.out.println(values[2]);
                System.out.println("Employees ID: " + values[0] + ", Name " + values[1] + ", Department " + values[2] + ", Salary " + values[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
