package Deeper1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++){
            String str = s.next();
            if (check(str) == true){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean check(String str){
        char[] arr = new char[26];
        int i = 1;
        arr[0] = str.charAt(0);

        while (i <= str.length() - 1) {
            char c = str.charAt(i);
            if (arr[c - 'a'] == 0) { // 나온 적 없는 알파벳
                arr[c - 'a'] = 1;
                i++;
            } else { // 나온 적 있는 알파벳
                if (c != str.charAt(i - 1)) {
                    return false;
                } i++;
            }
        }
        return true;
    }
}
