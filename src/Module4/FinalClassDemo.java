package Module4;

final class FinalClassDemo {
    void show() {
        System.out.println("Final class cannot be inherited");
    }

    public static void main(String[] args) {
        FinalClassDemo obj = new FinalClassDemo();
        obj.show();
    }
}