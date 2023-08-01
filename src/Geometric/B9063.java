package Geometric;
import java.util.Scanner;
public class B9063 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        int x_min = s.nextInt();
        int y_min = s.nextInt();
        int x_max = x_min;
        int y_max = y_min;

        for (int i = 0; i < t-1; i++) {
            int x = s.nextInt();
            int y = s.nextInt();

            if (x >= x_max) {
                x_max = x;
            }
            if (x <= x_min) {
                x_min = x;
            }
            if (y >= y_max) {
                y_max = y;
            }
            if (y <= y_min) {
                y_min = y;
            }
        }

        System.out.println((x_max-x_min)*(y_max-y_min));
    }
}
