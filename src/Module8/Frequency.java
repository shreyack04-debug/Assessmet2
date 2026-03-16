package Module8;

public class Frequency {
    public static void main(String[] args) {

        String str = "hello";

        int count;

        for(char c='a'; c<='z'; c++){

            count = 0;

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==c)
                    count++;
            }

            if(count>0)
                System.out.println(c+" : "+count);
        }
    }
}
