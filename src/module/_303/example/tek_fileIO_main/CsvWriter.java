package module._303.example.tek_fileIO_main;

import java.io.*;

public class CsvWriter {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees2.csv"))) {
            writer.write("EmployeeID,Name,Department,Salary\n");
            writer.write("1,John doe,Hr,50000\n");
            writer.write("2,Jane doe,IT,60000\n");
            writer.write("3,Sam Smith,Finance,70000\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
