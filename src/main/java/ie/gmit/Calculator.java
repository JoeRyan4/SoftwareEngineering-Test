package ie.gmit;

public class Calculator {
    static int add(int firstNum, int secondNum) {
        int result;
        result = firstNum + secondNum;
        return result;
    }


    public static void main(String args[]) {
        System.out.println("result" + add(3,5));

    }

}
