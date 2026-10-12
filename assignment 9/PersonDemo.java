     class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    int employeeId;
    String jobTitle;

    Employee(String firstName, String lastName,
             int employeeId, String jobTitle) {

        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    String getEmployeeId() {
        return String.valueOf(employeeId);
    }

    @Override
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class PersonDemo {
    public static void main(String[] args) {

        Employee e = new Employee(
                "Ankit",
                "Lenka",
                101,
                "Software Developer"
        );

        System.out.println("First Name: " + e.getFirstName());
        System.out.println("Last Name: " + e.getLastName());
        System.out.println("Employee ID: " + e.getEmployeeId());
    }
}