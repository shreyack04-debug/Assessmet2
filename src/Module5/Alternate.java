package Module5;

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

public class Alternate {
    public static void main(String args[]) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}