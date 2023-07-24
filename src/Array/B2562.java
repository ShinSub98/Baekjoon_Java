package Array;

import java.util.Scanner;
public class B2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] lst = new int[9];
        for (int i = 0; i < 9; i++){
            lst[i] = s.nextInt();
        }

        int max = lst[0];
        int cnt=1;
        for (int i = 1; i < 9; i++){
            if (lst[i] > max) {
                max = lst[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
