
class Calculator {

    int a;
    int b;

    public int add(int n1, int n2) {
        System.out.println("in add");
        int r = n1 + n2;
        return r;
    }
}

class conditonLoop {

    public static void main(String[] args) {
        //calss call
        Calculator calc = new Calculator();

        int retunRes = calc.add(4, 5);
        System.out.println("method call add " + retunRes);
        ///
        int a = 10;
        if (a > 1000) {
            System.out.println("if");
        } else if (a > 5) {
            System.out.println("if elser");
        } else {
            System.out.println("else");
        }

        ///terneryoperator 
        
        int n = 4;

        int result = 0;

        result = n % 2 == 0 ? 10 : 11;

        System.out.print(result);

        //switch statement
        switch (n) {
            case 1:
                System.out.println("this is 1");

                break;
            case 4:
                System.out.println("this is 4");

                break;
            case 5:
                System.out.println("this is 5");

                break;
            default:
                System.out.println("this is not valid");
        }

        //loop 
        while (n < 10) {

            System.out.println("this is  valid " + n);
            n++;
        }

        do {

            System.out.println("this is  valid do while loop " + n);
            n++;
        } while (n < 10);

        for (int i = 0; i < 10; i++) {

            System.out.println("this is  valid for loop " + i);

        }
    }
}
