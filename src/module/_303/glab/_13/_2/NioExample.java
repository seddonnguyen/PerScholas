package module._303.glab._13._2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import static java.nio.file.StandardOpenOption.*;

public class NioExample {
    public static void main(String[] args) throws IOException {
        String[] inputFiles = {"file1.txt", "file2.txt"};
        var outputFile = "nioOutput.txt";
        Path resourcePath = Path.of("src","module","_303", "GLAB", "_13", "_2", "resource");

        try (var outputChannel = FileChannel.open(resourcePath.resolve(outputFile), CREATE, WRITE)) {
            for (var file : inputFiles) {
                try (var inputChannel = FileChannel.open(resourcePath.resolve(file), READ)) {
                    var inputBuffer = ByteBuffer.allocate((int) inputChannel.size());

                    System.out.println(STR."Transferring file: \{file}");
                    while (inputChannel.read(inputBuffer) > 0) {
                        inputBuffer.flip();

                        System.out.println(STR."Writing to \{outputFile}: \n\{new String(inputBuffer.array())}");
                        outputChannel.write(inputBuffer);
                        inputBuffer.clear();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
