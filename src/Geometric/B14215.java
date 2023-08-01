package Geometric;
import java.util.Scanner;
public class B14215 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int max = 0;

        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

        if (max < x) {
            max = x;
        }
        if (max < y) {
            max = y;
        }
        if (max < z) {
            max = z;
        }

        int sum = x+y+z;

        if (sum - max <= max) {
            System.out.println((sum-max) - 1 + (sum - max));
        } else {
            System.out.println(sum);
        }
    }
}
