package Factor_Multiple_Prime;
import java.util.Scanner;
public class B11653 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        if (n!=1){
            while (true) {
                boolean check = false;
                for (int i = 2; i <= n/2; i++) {
                    if (n%i == 0) {
                        System.out.println(i);
                        n = n/i;
                        check = true;
                        break;
                    }
                }
                if (check == false) {
                    break;
                }
            }
            System.out.println(n);
        }

    }
}
