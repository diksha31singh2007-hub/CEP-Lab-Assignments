import java.util.Scanner;

class Person {
    String name;
    int age;

    void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    String employeeId;
    String designation;

    void setEmployeeDetails(String employeeId, String designation) {
        this.employeeId = employeeId;
        this.designation = designation;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + designation);
    }
}

class Manager extends Employee {
    String department;
    int level;

    void setManagerDetails(String department, int level) {
        this.department = department;
        this.level = level;
    }

    void displayManagerDetails() {
        System.out.println("Department: " + department);
        System.out.println("Manager Level: " + level);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();
        emp.setPersonDetails(name, age);
        emp.setEmployeeDetails(empId, designation);

        System.out.println("\n=== Employee Details ===");
        emp.displayPersonDetails();
        emp.displayEmployeeDetails();

        sc.close();
    }
}