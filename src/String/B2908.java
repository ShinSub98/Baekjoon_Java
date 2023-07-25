package String;
import java.util.Scanner;
public class B2908 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        String str1 = reverse(n).toString();
        String str2 = reverse(m).toString();

        n = Integer.parseInt(str1);
        m = Integer.parseInt(str2);

        if (n < m) {
            System.out.println(m);
        } else {
            System.out.println(n);
        }


    }

    static StringBuilder reverse(int k){
        String str = Integer.toString(k);
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb;
    }
}
