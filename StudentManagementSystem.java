import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n===== Student Management System =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    students.add(new Student(id, name, age));

                    System.out.println("Student Added Successfully!");

                    break;

                case 2:

                    if(students.isEmpty()) {

                        System.out.println("No Students Found");
                    }
                    else {

                        for(Student s : students) {

                            s.display();
                        }
                    }

                    break;

                case 3:

                    System.out.println("Thank You!");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
