package lang.lang.wrapper.test;

public class WrapperTest1 {

    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "10";

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str1);
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
    }
}
