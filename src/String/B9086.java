package String;
import java.util.Scanner;
public class B9086 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++){
            String str = s.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0)).append(str.charAt(str.length()-1));
            System.out.println(sb);
        }
    }
}
