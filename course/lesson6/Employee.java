package course.lesson6;

//Перегрузка конструкторов
public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age) {
        this(id, surname, age, 0.0, null);
    }

    public Employee(String surname, int age) {
       this(0, surname, age, 0.0, null);
    }

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Stivens", 20);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Snow", 38);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(3, "Adison", 32, 85.575, "IT");
        System.out.println(emp3.department);


    }
}

