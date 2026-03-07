package Module5;

public class ThreadUsingThread extends Thread {

    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {

        ThreadUsingThread t = new ThreadUsingThread();
        t.start();

    }
}