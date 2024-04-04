package module._303.glab._13._1;

public class course {
    private String code, course_name, instructor_name;

    public course(String code, String course_name, String instructor_name) {
        this.code = code;
        this.course_name = course_name;
        this.instructor_name = instructor_name;
    }

    public course() {
        this.code = "";
        this.course_name = "";
        this.instructor_name = "";
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourse_name() {
        return this.course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getInstructor_name() {
        return this.instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }
}
