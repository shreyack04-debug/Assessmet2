package Module4;

class StaticDemo {
    static int count = 0;

    static void display() {
        count++;
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticDemo.display();
        StaticDemo.display();
    }
}