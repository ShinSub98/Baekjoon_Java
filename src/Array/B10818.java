package Array;

import java.util.Arrays;
import java.util.Scanner;
public class B10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++){
            lst[i] = s.nextInt();
        }

        Arrays.sort(lst);
        System.out.printf("%d %d", lst[0], lst[n-1]);
    }
}
