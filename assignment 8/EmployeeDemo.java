class Employee {
    String name;
    double salary;
    int hireYear;

    
    Employee(String name, double salary, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
    }

   
    int calculateYearsOfService(int currentYear) {
        return currentYear - hireYear;
    }

    
    void display(int currentYear) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Year: " + hireYear);
        System.out.println("Years of Service: "
                + calculateYearsOfService(currentYear));
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e = new Employee("Ankit", 30000, 2024);

        e.display(2026);
    }
}