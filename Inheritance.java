
class Inheritance {

    public static void main(String[] args) {
        SintificCalc newCal = new SintificCalc(5, 5, 7);
        newCal.show();
    }
}

class Calc {

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

class SintificCalc extends Calc {

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
