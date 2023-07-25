package String;
import java.util.Scanner;
public class B11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += Character.getNumericValue(str.charAt(i));

        }
        System.out.println(sum);

    }
}
