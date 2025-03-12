
// class A extends Thread { // Extend Thread class
//     @Override
//     public void run() { // Override the run() method of Thread
//         for (int i = 1; i < 10; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(1);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B extends Thread { // Extend Thread class
//     @Override
//     public void run() { // Override the run() method of Thread
//         for (int i = 1; i < 10; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(1);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
class CounterT {

    int count;

    public synchronized void increment() {

        count++;
    }
}

public class Demo { // Main class

    public static void main(String[] args) throws InterruptedException {

        // A obj1 = new A();
        // B obj2 = new B();
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj1.start();
        // try {
        //     Thread.sleep(1);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // } // Calls the start() method of Thread
        // obj2.start(); // Calls the start() method of Thread
        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());
        CounterT c = new CounterT();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // Wait for t1 and t2 to finish
        t1.join();
        t2.join();

        // Now print the value of c.count
        System.out.println("Count: " + c.count);
    }
}
