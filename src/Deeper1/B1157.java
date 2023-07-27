package Deeper1;
import java.util.Scanner;
public class B1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        str = str.toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++){
            arr[str.charAt(i)-'A']++;
        }

        int max = -1;
        char c = '?';

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                c = (char)(i+'A');
            } else if (arr[i] == max) {
                c = '?';
            }
        }
        System.out.println(c);




    }
}
