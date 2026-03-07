package Module4;

public class StringComparison {
    public static void main(String[] args) {

        String s = "Hello";
        s.concat(" World");

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");

        System.out.println("String: " + s);
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sf);
    }
}