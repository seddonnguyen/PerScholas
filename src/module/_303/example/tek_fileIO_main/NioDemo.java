package module._303.example.tek_fileIO_main;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioDemo {

    public static void main(String[] args) {


        Path writePath = Paths.get("employee.csv");
        try (FileChannel writeChannel = FileChannel.open(writePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
            String data =
                    "Person,Name,Department,Salary\n" +
                            "1,John doe,Hr,50000\n" + "2,Jane doe,IT,60000\n" +
                            "3,Sam Smith,Finance,70000\n";
            writeBuffer.put(data.getBytes());
            writeBuffer.flip();
            while (writeBuffer.hasRemaining()) {
                writeChannel.write(writeBuffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path readPath = Paths.get("employee.csv");
        try (FileChannel readChannel = FileChannel.open(readPath, StandardOpenOption.READ)) {
            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
            while (readChannel.read(readBuffer) > 0) {
                readBuffer.flip();
                while (readBuffer.hasRemaining()) {
                    System.out.print((char) readBuffer.get());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
