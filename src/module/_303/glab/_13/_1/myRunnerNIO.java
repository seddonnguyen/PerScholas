package module._303.glab._13._1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class myRunnerNIO {
    public static void main(String[] args) throws IOException {
        Path inputFile = Path.of("src","module","_303", "GLAB", "_13", "_1").resolve("CourseData.csv");

        try (var fileChannel = FileChannel.open(inputFile, StandardOpenOption.READ)) {
            var readBuffer = ByteBuffer.allocate(1024);
            var sb = new StringBuilder();

            readBuffer.clear();
            while (fileChannel.read(readBuffer) > 0) {
                readBuffer.flip();
                while (readBuffer.hasRemaining()) {
                    sb.append((char) readBuffer.get());
                }
                readBuffer.clear();
            }

            var lines = sb.toString().split("\n");
            var courses = new ArrayList<course>();

            for (var line : lines) {
                var values = line.split(",");
                var course = new course();
                course.setCode(values[0]);
                course.setCourse_name(values[1]);
                course.setInstructor_name(values[2]);
                courses.add(course);
            }

            for (var course : courses) {
                System.out.println(STR."\{course.getCode()} | \{course.getCourse_name()} | \{course.getInstructor_name()}");
                System.out.println("===============================");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}