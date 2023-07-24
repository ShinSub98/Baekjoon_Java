package Array;

import java.util.Scanner;
public class B10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++){
            lst[i] = s.nextInt();
        }

        int x = s.nextInt();
        int count = 0;
        for (int i : lst){
            if (x == i){
                count++;
            }
        }
        System.out.println(count);
    }
}
