package Deeper2;
import java.util.*;
import java.io.*;
public class B20920_compare_important {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            if (word.length() >= m) {
                int cnt = hm.getOrDefault(word, 0);
                hm.put(word, cnt+1);
            }
        }

        ArrayList<String> words = new ArrayList<>();
        for (String s : hm.keySet()) {
            words.add(s);
        }

        words.sort((o1, o2) ->{
            int c1 = hm.get(o1);
            int c2 = hm.get(o2);

            if (c1 == c2) {
                if (o1.length() == o2.length()) { // 두 단어가 빈도, 길이 모두 같으면 알파벳순으로 정
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
            return c2 - c1;
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i)).append('\n');
        }

        System.out.println(sb);

    }
}
