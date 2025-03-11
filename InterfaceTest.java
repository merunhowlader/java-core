
interface Computer {

    abstract public void code();
}

class Laptop implements Computer {

    public void code() {
        System.out.println("code , compile , run...");
    }
}

class Desktop implements Computer {

    public void code() {
        System.out.println("fast code ,run , compile ...");
    }
}

class Developer {

    public void devApp(Computer com) {
        com.code();
    }
}

class InterfaceTest {

    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer merun = new Developer();

        merun.devApp(lap);
        // A obj;
        // obj = new B();
        // obj.config();
        // obj.show();

        // System.out.println(A.age);
        //Imterface instansited 
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in show interface instentiead");
            }

        };

        obj.show();

        ///lamda expression
        ///its just like interface instansited but in eayer way
        //not need to name interface and function functiuon name
        //name java will find it by referance veriable type name 
        //use instade ()->
        A objLamda = () -> {

            System.out.println("in show lamda 1 ");
        };

        objLamda.show();

        //can be written in one line 
        A objLamda2 = () -> System.out.println("in show lamda 2");
        objLamda2.show();
        //lamda with   parmiter 
        C objLamdaParamiter = (int i) -> System.out.println("in show lamda paramiter " + i);

        objLamdaParamiter.show(5);

        //or we can remove type form paramiter 
        C objLamdaParamiter2 = i -> System.out.println("in show lamda paramiter 2" + i);

        objLamdaParamiter2.show(5);

        ///lamda function with return

        // D objLamdaRerturn = (a, b) -> {
        //     return a + b;

        // };
             D objLamdaRerturn = (a, b) -> a + b;

        int added = objLamdaRerturn.add(5, 19);
        System.out.println(added);

    }
}

@FunctionalInterface
interface A {

    void show();
}
//functional interface with parameter check

interface C {

    void show(int i);
}
//lamda with return

interface D {

    int add(int a, int b);
}

// class B implements A {
//     public void show() {
//         System.out.println("in show");
//     }
// }
// interface A {
//     //every veriable in interface is final and static 
//     //every method in interface in public abstract
//     //interface are implementd not exteded 
//     //only a interface can extend another interface
//     //interface is just design not a instance 
//     //interface dot have memory in heap thats why veriable are final
//     int age = 50;
//     int area = 100;
//     void show();
//     void config();
// }
// //class can implement multipel interface at once /// class B implements A,X
// class B implements A {
//     public void show() {
//         System.out.println("in Show");
//     }
//     ;
//     public void config() {
//         System.out.println("in config");
//     }
// ;

// }
