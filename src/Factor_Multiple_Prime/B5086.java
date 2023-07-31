package Factor_Multiple_Prime;
import java.util.Scanner;
public class B5086 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a == 0 & b == 0) {
                break;
            }
            System.out.println(check(a, b));
        }
    }

    static String check (int a, int b) {
        if (a > b) {
            if (a % b == 0) {
                return "multiple";
            } return "neither";
        } else {
            if (b % a == 0) {
                return "factor";
            } return "neither";
        }
    }
}
