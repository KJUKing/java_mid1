package lang.nested.annoymous.ex;

public class Ex0RefMain {
    public static void main(String[] args) {
        hello("java");
        hello("spring");
    }

    public static void helloJava() {
        System.out.println("프로그램시작"); //변하지 않는 부분
        System.out.println("Hello Java"); // 변하는 부분
        System.out.println("프로그램종료"); // 변하지 않는 부분
    }
    //핵심은 변하지않는부분과 변하는부분을 분리해내야함


    public static void helloSpring() {
        System.out.println("프로그램시작");
        System.out.println("Hello Java");
        System.out.println("프로그램종료");
    }

    public static void hello(String str) { //합체
        System.out.println("프로그램시작");
        System.out.println(str);
        System.out.println("프로그램종료");
    }
}
