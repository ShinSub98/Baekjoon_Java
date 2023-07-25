package String;
import java.util.Scanner;
public class B5622 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            sum += number(str.charAt(i));
        }
        System.out.println(sum);
    }

    static int number(char c){
        if (c == 'A' | c==  'B' | c==  'C'){
            return 3;
        } else if (c == 'D' | c == 'E' | c == 'F') {
            return 4;
        } else if (c == 'G' | c == 'H' | c == 'I') {
            return 5;
        } else if (c == 'J'|c=='K'|c=='L') {
            return 6;
        } else if (c=='M'|c=='N'|c=='O') {
            return 7;
        } else if (c=='P'|c=='Q'|c=='R'|c=='S') {
            return 8;
        } else if (c=='T'|c=='U'|c=='V') {
            return 9;
        } else {
            return 10;
        }
    }
}
