package lang.exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{

        //문제상황
        MyCheckedException ex = new MyCheckedException("ex");
        throw ex;
    }
}
