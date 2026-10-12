
class Student {
    int rollNo;
    String name;

   
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s = new Student(101, "Ankit");
        s.display();
    }
}

//Roll No: 101
//Name: Ankit