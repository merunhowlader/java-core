package tools;

public class Calc {

    protected int a;
    protected int b;

    public Calc() {
        System.out.println("Parent calass Defalult constractor called ");
    }

    public Calc(int a, int b) {
        System.out.println("Parent calass Paramitirized  constractor called ");
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public void show() {
        System.out.println("Parent calculatr show ");
    }
}
