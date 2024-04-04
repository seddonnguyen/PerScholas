package module._303.glab._13._1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class myRunner {
    public static void main(String[] args) throws IOException {
        Path inputFile = Path.of("src","module","_303", "GLAB", "_13", "_1", "resource").resolve("CourseData.csv");

        try (var bufferedReader = Files.newBufferedReader(inputFile)) {
            var courses = new ArrayList<course>();

            while (bufferedReader.ready()) {
                var line = bufferedReader.readLine();
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
            throw new RuntimeException(e);
        }
    }
}
