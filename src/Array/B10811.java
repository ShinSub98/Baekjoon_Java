package Array;

import java.util.Scanner;
public class B10811 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] lst = new int[n];

        for (int i = 0; i < n; i++){
            lst[i] = i+1;
        }
        n = s.nextInt();
        for (int i = 0; i < n; i++){
            change(lst, s.nextInt(), s.nextInt());
        }

        for (int i : lst){
            System.out.printf("%d ", i);
        }

    }

    static void change(int[] lst, int l, int j){
        while (l < j){
            int k = lst[l-1];
            lst[l-1] = lst[j-1];
            lst[j-1] = k;
            l += 1;
            j -= 1;
        }
    }
}
