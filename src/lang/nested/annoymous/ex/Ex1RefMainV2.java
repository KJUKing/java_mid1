package lang.nested.annoymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {
    public static void hello(java.lang.Process process) {
        System.out.println("프로그램 시작");
        //코드 조각 시작
        process.run();
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {

        class Dice implements java.lang.Process {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        }

        class Sum implements java.lang.Process {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        hello(new Sum());
        hello(new Dice());
    }
}
