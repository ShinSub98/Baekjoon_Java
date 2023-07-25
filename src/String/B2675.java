package String;
import java.util.Scanner;
public class B2675 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            int m = s.nextInt();
            String str = s.next();
            for (int k = 0; k < str.length(); k++){
                for (int q = 0; q < m; q++){
                    sb.append(str.charAt(k));
                }
            }
            System.out.println(sb);
        }

    }
}
