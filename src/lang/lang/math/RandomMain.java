package lang.lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

        Random random = new Random();
//        Random random = new Random(1); // seed가 같으면 Random의 결과가 같다

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomdouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int i = random.nextInt(10);
        System.out.println("i = " + i);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("randomRange2 = " + randomRange2);
    }
}
