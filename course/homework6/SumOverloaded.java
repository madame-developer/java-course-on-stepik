package course.homework6;

public class SumOverloaded {

    public void sum() {
        System.out.println(0);
    }

    public int sum(int num1) {
        System.out.println(num1);
        return num1;
    }

    public int sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }

    public int sum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        System.out.println(result);
        return result;
    }
    
    public int sum(int num1, int num2, int num3, int num4) {
        int result = num1 + num2 + num3 + num4;
        System.out.println(result);
        return result;
    }
}

class SumOverloadedTest {
    public static void main(String[] args) {
        SumOverloaded sO = new SumOverloaded();
        sO.sum();
        int num1 = 5;
        sO.sum(num1);
        int num2 = 10;
        sO.sum(num1, num2);
        int num3 = 25;
        sO.sum(num1, num2, num3);
        int num4 = 50;
        sO.sum(num1, num2, num3, num4);
    }
}

