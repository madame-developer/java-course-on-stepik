package course.lesson6;

public class MethodOverloading {
    public void show(int num1) {
        System.out.println(num1);
    }

    public void show(boolean b1) {
        System.out.println(b1);
    }

    public void show(String str) {
        System.out.println(str);
    }

    public void show(String str, int a) {
        System.out.println("String: " + str + "," + " int: " + a);
    }
}

//overloading методы исмеют одинаковые имена, но разный список параметров (по типам данных, по количеству, по порядку следования)!

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String str1 = "Hello world!";
        mO.show(str1);
        mO.show("Hi", 5);
    }
}
