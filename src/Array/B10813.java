package Array;
import java.util.Scanner;
public class B10813 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[] lst = new int[n];

        for (int i = 0; i < n; i++){
            lst[i] = i+1;
        }

        for (int i = 0; i < m; i++){
            int l = s.nextInt();
            int j = s.nextInt();
            int k = lst[l-1];
            lst[l-1] = lst[j-1];
            lst[j-1] = k;
        }

        for (int i:lst){
            System.out.printf("%d ", i);
        }
    }
}
