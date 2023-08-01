package Geometric;
import java.util.Scanner;
public class B3009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int y;

        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int x3 = s.nextInt();
        int y3 = s.nextInt();

        if (x1 == x2) {
            x = x3;
        } else if (x1 == x3) {
            x = x2;
        } else {
            x = x1;
        }

        if (y1 == y2) {
            y = y3;
        } else if (y1 == y3) {
            y = y2;
        } else {
            y = y1;
        }

        System.out.printf("%d %d", x, y);
    }
}
