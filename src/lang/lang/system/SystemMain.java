package lang.lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재시간 밀리초 갖고오기
        long curr = System.currentTimeMillis();
        System.out.println("curr = " + curr);

        // 현재시간 나노초 갖고오기
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);
        
        // 환경 변수를 읽는다.
        System.out.println("System.getenv() = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("System.getProperties() = " + System.getProperties());
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0 ,copiedArray, 0, originalArray.length);

        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
//        System.exit(0); 가급적이면 사용하면 안된다.
        System.out.println("hello");
    }
}
