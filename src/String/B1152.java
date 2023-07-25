package String;
import java.util.Scanner;
public class B1152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int cnt = 0;
        for (String i : arr){
            if (i != ""){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
