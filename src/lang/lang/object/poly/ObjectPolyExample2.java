package lang.lang.object.poly;

import lang.object.poly.Car;
import lang.object.poly.Dog;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        lang.object.poly.Dog dog = new Dog();
        lang.object.poly.Car car = new Car();
        Object object = new Object(); //Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}
