package Recursive;
import java.io.*;
public class B25501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int cnt = 0;
            int l = 0;
            int r = str.length()-1;

            while (true) {
                if (l >= r) {
                    cnt++;
                    sb.append(1).append(' ').append(cnt).append('\n');
                    break;
                } else if (str.charAt(l) == str.charAt(r)) {
                    l++;
                    r--;
                    cnt++;
                } else {
                    cnt++;
                    sb.append(0).append(' ').append(cnt).append('\n');
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
