package Geometric;
import java.util.Scanner;
public class B10101 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

        if (x + y + z != 180) {
            System.out.println("Error");
        } else if (x == y & y == z) {
            System.out.println("Equilateral");
        } else if (x == y | y == z | z == x) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
