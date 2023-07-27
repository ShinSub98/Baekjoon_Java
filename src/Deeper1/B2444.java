package Deeper1;
import java.util.Scanner;
public class B2444 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++){
            for (int k = n-i; k > 0; k--){
                sb.append(" ");
            }
            for (int k = 1; k <= (i*2)-1; k ++){
                sb.append("*");
            }
//            for (int k = n-i; k > 0; k--){
//                sb.append(" ");
//            }
            sb.append("\n");
        }

        for (int i = 1; i < n; i++){ //i: 1~4
            for (int k = 1; k <= i; k++){
                sb.append(" ");
            }
            for (int k = 1; k <= 2*n - 2*i-1; k++){
                sb.append('*');
            }
//            for (int k = 1; k <= i; k++) {
//                sb.append(" ");
//            }
            if (i != n-1){
                sb.append('\n');
            }

        }
        System.out.print(sb);
    }
}
