package Mathematics1;
import java.util.Scanner;
public class B11005 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int number = s.nextInt();
        String answer = Integer.toString(n, number);
        answer = answer.toUpperCase();
        System.out.println(answer);
    }
}
