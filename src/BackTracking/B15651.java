package BackTracking;
import java.util.*;
import java.io.*;
public class B15651 {
    static int n; // 1부터 n까지의 자연수
    static int m; // m개를 고른 수열
    static int arr[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        dfs(0);
        System.out.println(sb);


    }

    static void dfs(int idx) {
        if (idx != m) {
            for (int i = 1; i <= n; i++) {
                arr[idx] = i;
                dfs(idx+1);
            }
        } else {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
        }
    }
}
