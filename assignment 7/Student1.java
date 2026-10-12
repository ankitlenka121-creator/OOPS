import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String course;

    void selectCourse() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Courses:");
        System.out.println("1. CSE");
        System.out.println("2. ECE");
        System.out.println("3. Civil");
        System.out.println("4. Mechanical");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                course = "CSE";
                break;
            case 2:
                course = "ECE";
                break;
            case 3:
                course = "Civil";
                break;
            case 4:
                course = "Mechanical";
                break;
            default:
                course = "Invalid";
        }
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Student1 {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Ankit";
        s.rollNo = 101;

        s.selectCourse();
        s.display();
    }
}