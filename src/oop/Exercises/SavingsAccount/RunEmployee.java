package oop.Exercises.SavingsAccount;

public class RunEmployee {
    public static void main(String[] args) {

        //EMPLOYEE 1
        Employee emp1 = new Employee(1001, "Andrei Clifford Laxa");

        System.out.println("==== EMPLOYEE INFO ====");
        emp1.displayInfo();
        System.out.println("=======================");

        System.out.println("\nComputing Salary..."); //COMPUTING SALARY
        emp1.computeSalary(102, 100);
        System.out.println("\n==== EMPLOYEE INFO ====");
        emp1.displayInfo();
        System.out.println("=======================");

        System.out.println("\nUpdating Salary..."); //UPDATING SALARY
        emp1.updateSalary(13, true);

        System.out.println("\n===== EMPLOYEE INFO (FINAL) ====");
        emp1.displayInfo();
        System.out.println("================================\n\n");

        //EMPLOYEE 2
        Employee emp2 = new Employee(1002, "Miguel Aquiatan");

        System.out.println("==== EMPLOYEE INFO ====");
        emp2.displayInfo();
        System.out.println("=======================");

        System.out.println("\nComputing Salary..."); //COMPUTING SALARY
        emp2.computeSalary(70, 98);
        System.out.println("\n==== EMPLOYEE INFO ====");
        emp2.displayInfo();
        System.out.println("=======================");

        System.out.println("\nUpdating Salary..."); //UPDATING SALARY
        emp2.updateSalary(13000, false);

        System.out.println("\n===== EMPLOYEE INFO (FINAL) =====");
        emp2.displayInfo();
        System.out.println("=================================\n\n");

        //EMPLOYEE 3
        Employee emp3 = new Employee(1003, "Adrian Valdez", 100);

        System.out.println("==== EMPLOYEE INFO ====");
        emp3.displayInfo();
        System.out.println("=======================");

        System.out.println("\nComputing Salary..."); //COMPUTING SALARY
        emp3.computeSalary(60, 105);
        System.out.println("\n==== EMPLOYEE INFO ====");
        emp3.displayInfo();
        System.out.println("=======================");

        System.out.println("\nUpdating Salary..."); //UPDATING SALARY
        emp3.updateSalary(1234);

        System.out.println("\n===== EMPLOYEE INFO (FINAL) =====");
        emp3.displayInfo();
        System.out.println("=================================");

        System.out.println("\n==================\nEmployee Count: " + Employee.getEmployeeCount() + "\n==================");

    }
}
