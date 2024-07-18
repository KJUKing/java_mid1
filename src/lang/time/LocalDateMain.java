package lang.time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("ofDate, 지정날짜 = " + ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(10);// 그래서 인자값을 변수에 담아야한다
        System.out.println("지정 날짜+ 10d = " + ofDate);

        //모든 날짜클래스는 불변이므로 변경이 발생하는 경우 새로운객체 생성해서 반환해야함


    }
}
