package Stack_Queue_Deque;
import java.io.BufferedReader;
import java.util.*;
import java.io.*;
public class B24511 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] sq = new int[n];
        int cnt = 0;

        String nums = br.readLine();
        StringTokenizer st = new StringTokenizer(nums);
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            sq[i] = x;
            if (x == 0) {
                cnt++;
            }
        }

        int[] arr = new int[cnt];

        int cnt2 = 0;

        nums = br.readLine();
        StringTokenizer st2 = new StringTokenizer(nums);
        for (int i : sq) {
            if (i == 0) {
                arr[cnt2++] = Integer.parseInt(st2.nextToken());
            } else {
                int x = Integer.parseInt(st2.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        nums = br.readLine();
        StringTokenizer st3 = new StringTokenizer(nums);
        if (m <= cnt) {
            for (int i = cnt-1; i >= (cnt-m); i--) {
                sb.append(arr[i]).append(' ');
            }
        } else {
            int rest = m - cnt;
            for (int i = cnt-1; i >= 0; i--) {
                sb.append(arr[i]).append(' ');
            }
            for (int i = 0; i < rest; i++) {
                sb.append(Integer.parseInt(st3.nextToken())).append(' ');
            }
        }

        System.out.println(sb);

    }
}

