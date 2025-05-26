package course.homework7;

public class Employee {

    int id;

    public String surname;
    
    private double salary;

    public Employee(int id) {
        this.id = id;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public void printId() {
        System.out.println("The id = " + id);
    }

    public void printSurname() {
        System.out.println("The surname = " + surname);
    }

    public void printSalary() {
        System.out.println("The salary = " + salary);
    }
}
