package lang.lang.object.tostring;

import lang.object.tostring.Car;
import lang.object.tostring.Dog;
import lang.object.tostring.ObjectPrinter;

public class ToStringMain2 {

    public static void main(String[] args) {
        lang.object.tostring.Car car = new Car("Model Y");
        lang.object.tostring.Dog dog1 = new lang.object.tostring.Dog("멍멍이1", 2);
        lang.object.tostring.Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        int i = System.identityHashCode(dog1);
        System.out.println("i = " + i);


        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);


    }
}
