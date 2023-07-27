package Deeper1;
import java.util.Scanner;
public class B3003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr1 = {1,1,2,2,2,8};
        int[] arr2 = new int[6];
        for (int i = 0; i < 6; i++){
            arr2[i] = s.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++){
            int n = arr1[i] - arr2[i];
            sb.append(n).append(" ");
        }

        System.out.println(sb);
    }
}
