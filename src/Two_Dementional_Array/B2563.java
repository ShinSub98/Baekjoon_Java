package Two_Dementional_Array;
import java.util.Scanner;
public class B2563 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[100][100];
        for (int i = 0; i < n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            for (int k = 0; k < 10; k++){
                for (int l = 0; l < 10; l++){
                    if (arr[a+k][b+l] == 0) {
                        arr[a+k][b+l] = 1;
                    } else {
                        continue;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 100; i++){
            for (int k = 0; k < 100; k++){
                sum += arr[i][k];
            }
        }
        System.out.println(sum);
    }
}
