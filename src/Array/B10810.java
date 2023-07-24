package Array;
import java.util.Scanner;

public class B10810 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] lst = new int[n];

        for (int i = 0; i < m; i++){
            int l = s.nextInt();
            int j = s.nextInt();
            int k = s.nextInt();
            for (int q = l; q <= j; q++){
                lst[q-1] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : lst){
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }
}
