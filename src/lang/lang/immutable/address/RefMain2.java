package lang.lang.immutable.address;

import lang.immutable.address.ImmutableAddress;

public class RefMain2 {

    public static void main(String[] args) {
        lang.immutable.address.ImmutableAddress a = new lang.immutable.address.ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산"); 값변경 불가
        System.out.println("부산 -> b");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
