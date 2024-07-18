package lang.lang.object.equals;

import lang.object.equals.UserV1;

public class EqualsMainV1 {
    public static void main(String[] args) {
        lang.object.equals.UserV1 user1 = new lang.object.equals.UserV1("id-100");
        lang.object.equals.UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));

    }
}
