package course.homework6;

public class StudentOverloaded {
    int cardId;
    String name;
    String surname;
    int course;
    int averageMarkMath;
    int averageMarkEcomomic;
    int averageMarkAverageLanguage;


    public StudentOverloaded(int cardId, String name, String surname, int course, int averageMarkMath, int averageMarkEcomomic, int averageMarkAverageLanguage) {
        this.cardId = cardId;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.averageMarkMath = averageMarkMath;
        this.averageMarkEcomomic = averageMarkEcomomic;
        this.averageMarkAverageLanguage = averageMarkAverageLanguage;
    }

    public StudentOverloaded(int cardId, String name, String surname, int course) {
        this(cardId, name, surname, course, 0, 0, 0);
    }

    public StudentOverloaded() {
        this(0, null, null, 0, 0, 0, 0);
    }
}



class StudentOverloadedTest {
    public static void main(String[] args) {
        StudentOverloaded student1 = new StudentOverloaded(1, "Ostin", "Butler", 3, 5, 4, 5);
        System.out.println(student1.surname);
        StudentOverloaded student2 = new StudentOverloaded(2, "Anne", "Tesla", 4);
        System.out.println(student2.name);
        StudentOverloaded student3 = new StudentOverloaded();
        System.out.println(student3.averageMarkEcomomic);
    }

}