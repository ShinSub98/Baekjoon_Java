package Array;
import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[10];
        int[] res = new int[42];

        for (int i = 0; i < 10; i++){
            int n = s.nextInt();
            nums[i] = n;
        }

        for (int i : nums) {
            if (res[(i%42)] == 0) {
                res[(i%42)] = 1;
            }
        }

        int cnt = 0;

        for (int i : res) {
            if (i != 0){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
