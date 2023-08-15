package Deeper2;
import java.util.*;
import java.io.*;
public class B26069 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("ChongChong", 1);

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            String name1 = st.nextToken();
            String name2 = st.nextToken();

            if ((ht.containsKey(name1)) | (ht.containsKey(name2))) {
                ht.put(name1, 1);
                ht.put(name2, 1);
            }
        }

        System.out.println(ht.size());
    }
}
