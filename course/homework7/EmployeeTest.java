package course.homework7;

public class EmployeeTest {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee("Stivens");
        //Employee emp3 = new Employee(100000.5) (данный конструктор не виден, так как поле salary приватное!);
        
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary); (невозможно обратиться, так как поле salary приватное!)

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        //System.out.println(emp2.salary); (невозможно обратиться, так как поле salary приватное!)

        emp1.printId();
        emp1.printSurname();
        emp1.printSalary();

        emp2.printId();
        emp2.printSurname();
        emp2.printSalary();
    }
}
