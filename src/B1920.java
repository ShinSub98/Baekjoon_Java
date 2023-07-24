import java.util.Arrays;
import java.util.Scanner;
public class B1920 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         int[] lst1 = new int[n];
         for (int i = 0; i < n; i++){
            lst1[i] = s.nextInt();
         }

        Arrays.sort(lst1);

         n = s.nextInt();
         int[] lst2 = new int[n];
         for (int i = 0; i < n; i++){
             lst2[i] = s.nextInt();
         }

         StringBuilder sb = new StringBuilder();

         for (int i : lst2){
             sb.append(bs(lst1, i)).append('\n');
         }

        System.out.println(sb);

    }

    static int bs(int[] a, int n){
        int l = 0;
        int r = a.length-1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (n < a[m]){
                r = m - 1;
            } else if (n > a[m]) {
                l = m + 1;
            } else if (n == a[m]){
                 return 1;
            }
        }
        return 0;
    }
}
