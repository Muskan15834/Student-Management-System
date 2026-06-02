import java.util.ArrayList;

public class StudentManagementSystem {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Muskan", 21));
        students.add(new Student(102, "Anu", 20));

        System.out.println("Student Records");

        for(Student s : students) {

            s.display();
        }
    }
}
