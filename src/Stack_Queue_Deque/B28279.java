package Stack_Queue_Deque;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> lst = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    lst.add(0, Integer.parseInt(st.nextToken()));
                    break;

                case 2:
                    lst.add(Integer.parseInt(st.nextToken()));
                    break;

                case 3:
                    if (lst.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(lst.remove(0)).append("\n");
                    } break;

                case 4:
                    if (lst.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(lst.remove(lst.size()-1)).append("\n");
                    } break;

                case 5:
                    sb.append(lst.size()).append("\n");
                    break;

                case 6:
                    if (lst.size() == 0) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    } break;

                case 7:
                    if (lst.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(lst.get(0)).append("\n");
                    } break;

                case 8:
                    if (lst.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(lst.get(lst.size()-1)).append("\n");
                    } break;
            }
        }
        System.out.println(sb);
    }
}
