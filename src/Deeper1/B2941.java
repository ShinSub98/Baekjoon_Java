package Deeper1;
import java.util.Scanner;
public class B2941 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        int cnt = 0;
        int i = 0;
        while (i < str.length()) {
            char currentChar = str.charAt(i);
            if (currentChar == 'c' && i < str.length() - 1) {
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    cnt++;
                    i += 2;
                    continue;
                }
            } else if (currentChar == 'd' && i < str.length() - 1) {
                if (str.charAt(i + 1) == '-') {
                    cnt++;
                    i += 2;
                    continue;
                } else if (i < str.length() - 2 && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                    cnt++;
                    i += 3;
                    continue;
                }
            } else if ((currentChar == 'l' || currentChar == 'n') && i < str.length() - 1) {
                if (str.charAt(i + 1) == 'j') {
                    cnt++;
                    i += 2;
                    continue;
                }
            } else if ((currentChar == 's' || currentChar == 'z') && i < str.length() - 1) {
                if (str.charAt(i + 1) == '=') {
                    cnt++;
                    i += 2;
                    continue;
                }
            }
            cnt++;
            i++;
        }

        System.out.print(cnt);
    }
}
