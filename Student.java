import java.util.ArrayList;

public class Student {
    public String name;
    public String grade;
    public ArrayList<String> courses;

    public Student(String name, String grade){
        this.name=name;
        this.grade=grade;
        this.courses = new ArrayList<>();
    }
    public void addCourses(String course){
        courses.add(course);
        System.out.println("The course <"+course+"> has been added to the courses collection");
    }
    public void removeCourse(String course){
    if(courses.contains(course)) {
        courses.remove(course);
        System.out.println("Removed course: " + course);
    } else {
        System.out.println("Course not found!");
    }
    }
}
