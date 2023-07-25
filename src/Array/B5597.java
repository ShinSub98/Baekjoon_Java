package Array;

import java.util.Scanner;
public class B5597 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] lst = new int[30];

        for(int i = 0; i < 28; i++){
            int n = s.nextInt();
            lst[n-1] = 1;
        }

        for (int i = 0; i < 30; i++){
            if (lst[i] != 1){
                System.out.println(i+1);
            }
        }
    }
}
