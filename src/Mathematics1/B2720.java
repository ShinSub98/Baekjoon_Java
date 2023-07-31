package Mathematics1;
import java.util.Scanner;
public class B2720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++){
            int n = s.nextInt();
            sb.append(n/25).append(' ');
            n = n%25;
            sb.append(n/10).append(' ');
            n = n%10;
            sb.append(n/5).append(' ');
            n = n%5;
            sb.append(n).append('\n');
        }
        System.out.println(sb);
    }

}
