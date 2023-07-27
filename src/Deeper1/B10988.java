package Deeper1;
import java.util.Scanner;

public class B10988 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(check(str));
    }


    static int check(String str){
        int n = str.length()-1;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != str.charAt(n-i)){
                return 0;
            }
        }
        return 1;
    }
}
