package Two_Dementional_Array;
import java.util.Scanner;
public class B10798 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++){
            String str = s.next();
            for (int k = 0; k < str.length(); k++){
                arr[i][k] = str.charAt(k);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++){
            for (int k = 0; k < 5; k++){
                if (arr[k][i] == 0) {
                    continue;
                } else {
                    sb.append(arr[k][i]);
                }
            }
        }
        System.out.println(sb);
    }
}
