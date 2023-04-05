


class NewThread extends Thread {

    String Name;
    long Time;
    Thread t;

    NewThread(String ThreadName, long Tm) {
        Name = ThreadName;
        Time = Tm;

        t = new Thread(this.Name);
        System.out.println("New Thread" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(Name + " - > " + i);
                Thread.sleep(Time);
            }
        } catch (Exception e) {
            System.out.println(Name + "Error");
        }
        System.out.println("Done");
    }
}

public class Q12 {
    public static void main(String args[]) {

        NewThread ob1 = new NewThread("A", 100);
        NewThread ob2 = new NewThread("B", 200);
        NewThread ob3 = new NewThread("C", 300);

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (Exception e) {
            System.out.println("Error");
        }

        NewThread ob4 = new NewThread("D", 100);
        NewThread ob5 = new NewThread("E", 200);
        NewThread ob6 = new NewThread("F", 300);

        try {
            ob4.t.join();
            ob5.t.join();
            ob6.t.join();
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("BYE BYE");
    }
}
