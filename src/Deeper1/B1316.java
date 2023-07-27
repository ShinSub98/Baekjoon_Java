package Deeper1;
import java.util.Scanner;
public class B1316 {
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
        int[] arr = new int[26];
        arr[str.charAt(0)-'a'] = 1;
        for (int i = 1; i < str.length(); i++){
            char c = str.charAt(i);

            if (arr[c - 'a'] == 0) { // 해당 알파벳이 처음 나오면
                arr[c-'a'] = 1;
            } else { // 처음이 아니면
                if (c == str.charAt(i - 1)) {
                    continue;
                } else {
                    return false;
                }
            }
        } return true;
    }
}
