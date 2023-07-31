package Mathematics1;
import java.util.Scanner;
public class B2869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int v = s.nextInt();

        int height = v-a;
        int up = a-b;

        if (height % up == 0) {
            System.out.println(height/up+1);
        } else {
            System.out.println(height/up+2);
        }
    }
}
