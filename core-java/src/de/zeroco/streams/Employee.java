package de.zeroco.streams;

public class Employee {
    
    private String name;
    private float salary;
    private String department; 
    
    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, float salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    
    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department; // Getter for department
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", department='" + department + "'}";
    }
    
}
