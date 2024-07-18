package lang.lang.object.poly;

import lang.object.poly.Car;
import lang.object.poly.Dog;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        lang.object.poly.Dog dog = new lang.object.poly.Dog();
        lang.object.poly.Car car = new lang.object.poly.Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound() //컴파일 오류, Object는 sound()가 없다.
        //obj.move() //컴파일 오류, Object는 move()가 없다.

        //객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();

        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
