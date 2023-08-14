package Stack_Queue_Deque;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18258 {
    public static void main(String[] args) throws IOException {
        int[] arr;
        int n;
        int front = 0;
        int rear = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());
        arr = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = bf.readLine();
            StringTokenizer st = new StringTokenizer(str);

            switch (st.nextToken()) {
                case "push":
                    arr[rear++] = Integer.parseInt(st.nextToken());
                    break;

                case "pop":
                    if (front == rear) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(arr[front++]).append("\n");
                    } break;

                case "size":
                    sb.append(rear-front).append("\n");
                    break;

                case "empty":
                    if (front == rear) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    } break;

                case "front":
                    if (front == rear) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(arr[front]).append("\n");
                    } break;

                case "back":
                    if (front == rear) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(arr[rear-1]).append("\n");
                    } break;

            }
        }
        System.out.println(sb);
    }
}
