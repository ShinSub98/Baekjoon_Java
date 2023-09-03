package BackTracking;
import java.util.*;
import java.io.*;
public class B15649 {
    static int n;
    static int m;
    static int[] arr;
    static int[] used;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 1부터 n까지
        m = Integer.parseInt(st.nextToken()); // m개의 숫자를 순서 있는 상태로 뽑은 경우의 수

        arr = new int[m];
        used = new int[n+1];

        dfs(0);


    }

    static void dfs(int idx) {
        if (idx == m) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(' ');
            }
            System.out.println(sb);
        } else {
            for (int i = 1; i < n+1; i++) {
                if (used[i] == 0) {
                    used[i] = 1;
                    arr[idx] = i;
                    dfs(idx+1);
                    used[i] = 0;
                }
            }
        }
    }
}
