package module._303.glab._13._2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.*;

public class NioExampleTwo {
    public static void main(String[] args) throws IOException {
        String[] inputFiles = {"file1.txt", "file2.txt"};
        String outputFile = "OutputExampleTwo.txt";
        Path resourcePath = Path.of("src","module","_303", "GLAB", "_13", "_2", "resource");

        try (WritableByteChannel outputChannel = FileChannel.open(resourcePath.resolve(outputFile), CREATE, WRITE)) {
            for (var file : inputFiles) {
                try (var inputChannel = FileChannel.open(resourcePath.resolve(file), READ)) {
                    // transferTo(long position, long count, WritableByteChannel target)
                    // Transfers bytes from this channel's file to the given writable byte channel.
                    System.out.println(STR."Transferring file: \{file} to \{outputFile}");
                    inputChannel.transferTo(0, inputChannel.size(), outputChannel);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
