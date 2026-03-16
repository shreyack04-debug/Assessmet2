package Module9;

public class SubSets {
    static void subset(String str, String curr){

        if(str.length()==0){
            System.out.println(curr);
            return;
        }

        subset(str.substring(1), curr + str.charAt(0));
        subset(str.substring(1), curr);
    }

    public static void main(String[] args) {
        subset("abc", "");
    }
}
