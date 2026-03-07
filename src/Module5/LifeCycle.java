package Module5;

class LifeCycle extends Thread {

    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println("Thread finished execution");
    }

    public static void main(String args[]) {

        LifeCycle t = new LifeCycle();

        System.out.println("Thread State: " + t.getState());

        t.start();

        System.out.println("Thread State after start: " + t.getState());
    }
}
