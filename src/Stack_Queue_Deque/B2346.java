package Stack_Queue_Deque;
import java.util.*;
public class B2346 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        int[] arr;

        int n = s.nextInt();
        arr = new int[n+1];

        for (int i = 1; i <=n; i++) {
            deque.add(i);
        }

        for (int i = 1; i <= n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            int m = deque.pollFirst();
            sb.append(m).append(' ');

            if (0 < arr[m]) {
                for (int k = 0; k < arr[m]-1; k++) {
                    deque.add(deque.removeFirst());
                }
            } else {
                for (int k = 0; k < -1*arr[m]; k++) {
                    deque.addFirst(deque.removeLast());
                }
            }
        } sb.append(deque.getFirst());

        System.out.println(sb);


    }
}
//오답노트
//맨 처음에는 LinkedList로 시도했으나 메모리 부족 -> LinkedList의 과도한 메모리 사용
//위 문제와 같이 정수 데이터(정적인 메모리 할당)를 앞뒤로 움직이기만 할 때는 ArrayList(이 문제에서는 ArrayDeque)이
//메모리 부분에서 효율적