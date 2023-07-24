package Array;

import java.util.Scanner;
public class B10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] lst = new int[n];
        int x = s.nextInt();

        for (int i = 0; i < n ; i++){
            lst[i] = s.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i : lst){
            if (i < x){
                sb.append(i).append(' ');
            }
        }
        System.out.println(sb);
    }
}
