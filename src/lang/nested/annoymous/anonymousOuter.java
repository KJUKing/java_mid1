package lang.nested.annoymous;

import nested.local.Printer;

public class anonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer p1 = new Printer() {
            int value;

            @Override // 인터페이스도 구현가능
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        p1.print();
        System.out.println("p1.getClass() = " + p1.getClass());
    }

    public static void main(String[] args) {
        anonymousOuter localOuter = new anonymousOuter();


        localOuter.process(2);
        
    }
}
