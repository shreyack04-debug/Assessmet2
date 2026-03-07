package Module5;

class ThreadUsingRunnable implements Runnable {

    public void run() {
        System.out.println("Thread using Runnable");
    }

    public static void main(String[] args) {
        Module5.ThreadUsingRunnable r = new ThreadUsingRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}