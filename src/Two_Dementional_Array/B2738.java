package Two_Dementional_Array;
import java.util.Scanner;
public class B2738 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                arr1[i][k] = s.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                arr2[i][k] = s.nextInt();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                sb.append(arr1[i][k] + arr2[i][k]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
