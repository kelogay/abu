/*Write a program that creates and starts three threads. Each thread is instantiated from the same class.
It executes a loop with ten iterations. Each iteration displays the character ‘A’ and sleep between 300 to 500 milliseconds.
The application waits for all threads to complete and then displays a message. (Using Thread Class)*/

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("a - > A");

            try {
                Thread.sleep(300);
            }

            catch (Exception e) {
                System.out.print("Error");
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int j = 0; j <= 5; j++) {
            System.out.println("b - > B");

            try {
                Thread.sleep(400);
            }

            catch (Exception e) {
                System.out.print("Error");
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int f = 0; f <= 5; f++) {
            System.out.println("c - > C");

            try {
                Thread.sleep(500);
            }

            catch (Exception e) {
                System.out.print("Error");
            }
        }
    }
}

public class Q11 {

    public static void main(String args[]) {

        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();

        ob1.start();
        ob2.start();
        ob3.start();

        try {
            ob1.join();
            ob2.join();
            ob3.join();
        } catch (Exception e) {
            System.out.print("Error");
        }
        System.out.println("BYE BYE");
    }

}
