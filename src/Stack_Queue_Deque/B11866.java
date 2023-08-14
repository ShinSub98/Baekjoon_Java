package Stack_Queue_Deque;
import java.util.Scanner;
import java.util.LinkedList;
public class B11866 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();

        LinkedList<Integer> lst = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 1; i <= n; i++) {
            lst.add(i);
        }

        while (lst.size() != 1) {
            for (int i = 0; i < t-1; i++){
                lst.add(lst.remove(0));
            }
            sb.append(lst.get(0)).append(", ");
            lst.remove(0);
        }

        sb.append(lst.get(0)).append(">");
        System.out.println(sb);




    }
}
