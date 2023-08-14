package Stack_Queue_Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class B2164 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        LinkedList<Integer> lst = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            lst.add(i);
        }

        while (lst.size() != 1) {
            lst.remove(0);
            lst.add(lst.get(0));
            lst.remove(0);
        }

        System.out.println(lst.get(0));



    }
}
