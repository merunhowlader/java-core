package tools;

public class SintificCalc extends Calc {

    private int c;

    public SintificCalc(int a, int b, int c) {
        super(a, b);
        System.out.println(" child callss Defalult constractor called ");

        this.c = c;
    }

    public int area() {
        return 1;
    }

    @Override
    public void show() {
        System.out.println("Signtific calculatr show ");
    }
}
