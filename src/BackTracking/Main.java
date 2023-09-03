package BackTracking;
import java.util.*;
import java.io.*;
public class Main {
    public static int n;
    public static int min = Integer.MAX_VALUE;
    public static int[][] player; // [x][y] =
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < n; k++) {
                player[i][k] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
