// Using Runnable interface

class A implements Runnable { // Implement Runnable

    @Override
    public void run() { // Override the run() method of Runnable
        for (int i = 1; i < 10; i++) {
            System.out.println("hi");
        }
    }
}

class B implements Runnable { // Implement Runnable

    @Override
    public void run() { // Override the run() method of Runnable
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class DemoThread { // Main class

    public static void main(String[] args) {

        Thread t1 = new Thread(new A()); // Create Thread with Runnable
        Thread t2 = new Thread(new B()); // Create Thread with Runnable

        t1.start(); // Start the thread
        t2.start(); // Start the thread
    }
}
