package String;
import java.util.Scanner;
public class B27866 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = s.nextInt();
        System.out.println(str.charAt(n-1));
    }
}
