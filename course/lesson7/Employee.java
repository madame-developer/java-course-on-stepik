package course.lesson7;

public class Employee {

    public double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void doubleSalary() {
        System.out.println("The new salary = " + (salary * 2));
    }

    public static void main(String[] args) {
        Employee emp = new Employee(80000);
        System.out.println(emp.salary);
        emp.doubleSalary();
    }


    
}
