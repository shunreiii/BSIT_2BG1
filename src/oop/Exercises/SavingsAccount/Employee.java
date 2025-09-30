package oop.Exercises.SavingsAccount;
import java.text.DecimalFormat;


public class Employee {
    //GETTER AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getRatePerHour() {
        return ratePerHour;
    }
    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    public static int getEmployeeCount() {
        return employeeCount;
    }

    //INITIALIZE VARIABLES
    int id;
    String name;
    double salary, hoursWorked, ratePerHour;
    static private int employeeCount = 0;

    //CONSTRUCTOR
    public Employee(int id, String name, double salary) {
        this(id, name); //calls the 2 parameter constructor
        this.salary = salary;
    }
    public Employee(int id, String name) {
        this(); //keyword that calls the default constructor
        this.id = id;
        this.name = name;
    }
    public Employee() { //DEFAULT CONSTRUCTOR
        this.id = 0;
        this.name = "name";
        this.salary = 0.00D;
        employeeCount++;
    }

    public void computeSalary(double hoursWorked, double ratePerHour){
        double grossPay = hoursWorked * ratePerHour;
        double tax = grossPay * 0.12;
        double netSalary = grossPay - tax;

        this.salary = netSalary;
    } //end of computeSalary

    //method overloading
    public void updateSalary(double amount){
        this.salary += amount;
    }
    public void updateSalary(double amount, boolean isPercentage){
        if(isPercentage){
            this.salary += (this.salary * amount) / 100;
        } else{
            this.salary += amount;
        }
    }


    public void displayInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);

        DecimalFormat df = new DecimalFormat("#.00");
        String formattedSalary = df.format(this.salary);
        System.out.println("Salary: " + formattedSalary);
    }


}
