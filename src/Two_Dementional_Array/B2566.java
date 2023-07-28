package Two_Dementional_Array;
import java.util.Scanner;
public class B2566 {
    public static void main(String[] args) {
        int r = 0;
        int l = 0;
        int max = -1;
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++){
            for (int k = 0; k < 9; k++){
                arr[i][k]  = s.nextInt();
            }
        }
        for (int i = 0; i < 9; i++){
            for (int k = 0; k < 9; k++){
                if (max < arr[i][k]){
                    max = arr[i][k];
                    r = i+1;
                    l = k+1;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", r, l);

    }
}
