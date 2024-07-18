package lang.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        //모든 enum 반환
        Grade[] values = Grade.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("value.name() = " + value.name() + ", ordinal=" + value.ordinal());
        }

//        String-> enum 변환 잘못도니 문자면 IllegalArgumentException 발생
        String input ="GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능
    }
}
