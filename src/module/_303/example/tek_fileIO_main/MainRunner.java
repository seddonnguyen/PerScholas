package module._303.example.tek_fileIO_main;

import java.io.*;
import java.util.Arrays;

public class MainRunner {
    public static void main(String[] args) {

//        String path = "C:/Users/rahee/Desktop/TestingFolder/app.txt";


        try {
            File f = new File("C:/Users/rahee/Desktop/TestingFolder/app.txt");
            if (f.createNewFile()) {
                System.out.println("New File created!");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
