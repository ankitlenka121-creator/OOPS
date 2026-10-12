class Employee {
    String name;
    String job;
    double salary;

    double calculateSalary(int workingDays) {
        return (salary / 30) * workingDays;
    }

    void updateSalary(int workingDays) {
        salary = calculateSalary(workingDays);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.name = "Ankit";
        e.job = "Software Developer";
        e.salary = 30000;

        System.out.println("Employee Details:");
        e.display();

        e.updateSalary(25);

        System.out.println("\nUpdated Salary:");
        e.display();
    }
}