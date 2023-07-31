package Mathematics1;
import java.util.Scanner;
public class B2903 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 2;
        int t = s.nextInt();
        for (int i = 0; i < t; i++){
            n = n*2-1;
        }
        System.out.println(n*n);
    }
}
