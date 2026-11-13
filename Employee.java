class Employee {
    int empId;
    String name;
    double basicSalary;

    // Parent class constructor
    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to calculate salary
    double calculateSalary() {
        return basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

// Permanent Employee class
class PermanentEmployee extends Employee {
    double allowance;
    double bonus;

    PermanentEmployee(int id, String name, double salary,
                      double allowance, double bonus) {
        super(id, name, salary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    // Method overriding
    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

// Contract Employee class
class ContractEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int id, String name, double salary,
                     int hoursWorked, double hourlyRate) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Method overriding
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class
class EmployeeMain {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new PermanentEmployee(
                101, "Naveen", 20000, 5000, 3000);

        employees[1] = new ContractEmployee(
                102, "Rahul", 0, 100, 200);

        for (int i = 0; i < employees.length; i++) {

            System.out.println("\nEmployee Details:");

            employees[i].displayDetails();

            System.out.println("Calculated Salary: "
                    + employees[i].calculateSalary());
        }
    }
}

