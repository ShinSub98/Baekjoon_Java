package Geometric;
import java.util.Scanner;
public class B5073 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true){
            int max = 0;
            int sum = 0;
            int x = s.nextInt();
            if (max < x) {
                max = x;
            }
            sum += x;
            int y = s.nextInt();
            if (max < y) {
                max = y;
            }
            sum += y;
            int z = s.nextInt();
            if (max < z) {
                max = z;
            }
            sum += z;
            if (x == 0 & y == 0 & z == 0) {
                break;
            }

            if (sum - max <= max) {
                System.out.println("Invalid");
                continue;
            }

            if (x == y & y == z) {
                System.out.println("Equilateral");
            } else if (x == y | y == z | z == x) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
