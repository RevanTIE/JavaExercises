package java_fundamentals.poo;

public class CallingStudents {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Alvaro");
        stu.setDateOfBirth("1990");
        stu.setStudentHousing(true);
        stu.setCourse(new Course());
        stu.getCourse().setTitle("Computer Science");
        stu.getCourse().setLevel("Undergraduate");
        stu.getCourse().setStartDate("8/21/2023");


        System.out.println("Name: " + stu.getName());
        System.out.println("DoB: " + stu.getDateOfBirth());
        System.out.println("Housing: " + (stu.hasStudentHousing() ? "yes" : "no"));
        System.out.println("The student " + stu.getName() + " is enrolled on the " + stu.getCourse().getTitle()
                            + " course due to start on " + stu.getCourse().getStartDate());
    }
}
