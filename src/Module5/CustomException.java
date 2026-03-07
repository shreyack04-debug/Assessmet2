package Module5;

// Custom Exception Class
class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}

// Main Class
public class CustomException{

    public static void main(String[] args) {

        try {
            throw new MyException("This is a custom exception");
        }

        catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}