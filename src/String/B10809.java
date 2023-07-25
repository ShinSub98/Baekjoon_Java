package String;
import java.util.Scanner;
public class B10809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        String str = s.next();
        StringBuilder sb = new StringBuilder();
        for (char i : arr){
            boolean check = false;
            for (int k = 0; k < str.length(); k++) {
                if (i == str.charAt(k)) {
                    sb.append(k).append(' ');
                    check = true;
                    break;
                }
            }
            if (check == false) {
                sb.append(-1).append(' ');
            }
        }
        System.out.println(sb);
    }
}
