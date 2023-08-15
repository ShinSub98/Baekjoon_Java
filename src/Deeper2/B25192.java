package Deeper2;
import java.util.*;
import java.io.*;
public class B25192 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        int n = Integer.parseInt(br.readLine());
        Hashtable <String, Integer> ht = new Hashtable<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            switch (str) {
                case "ENTER":
                    ht.clear();
                    break;

                default:
                    if (ht.containsKey(str)) {
                        break;
                    } else {
                        ht.put(str, 1);
                        cnt++;
                        break;
                    }

            }
        }
        System.out.println(cnt);
    }
}
