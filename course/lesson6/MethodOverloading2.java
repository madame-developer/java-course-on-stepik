package course.lesson6;

public class MethodOverloading2 {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public String sum(String str1, String str2) {
        return str1 + str2;
    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();
        int num1 = 5;
        int num2 = 10;
        int intResult = mO2.sum(num1, num2);
        System.out.println(intResult);
        String str1 = "Good";
        String str2 = " morning!";
        String stringResult = mO2.sum(str1, str2);
        System.out.println(stringResult);
    }
}
