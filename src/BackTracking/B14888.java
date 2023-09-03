package BackTracking;
import java.util.*;
import java.io.*;
public class B14888 {
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static int n;
    public static int[] arr;
    public static int[] operator = new int[4];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);




    }

    public static void dfs(int num, int idx) {
        if (idx == n) {
            MAX = Math.max(num, MAX);
            MIN = Math.min(num, MIN);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i] --;

                switch (i) {
                    case 0:
                        dfs(num+arr[idx], idx+1);
                        break;
                    case 1:
                        dfs(num-arr[idx], idx+1);
                        break;
                    case 2:
                        dfs(num*arr[idx], idx+1);
                        break;
                    case 3:
                        dfs(num/arr[idx], idx+1);
                        break;
                }
                operator[i]++;
            }
        }
    }

}
