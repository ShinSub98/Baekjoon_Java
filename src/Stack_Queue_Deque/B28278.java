package Stack_Queue_Deque;
import java.util.Scanner;
public class B28278 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int position = -1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            switch (s.nextInt()){
                case 1:
                    arr[++position] = s.nextInt();
                    break;

                case 2:
                    if (position == -1){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(arr[position--]).append('\n');
                    }
                    break;

                case 3:
                    sb.append(position+1).append('\n');
                    break;

                case 4:
                    if (position == -1) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;

                case 5:
                    if (position == -1){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(arr[position]).append('\n');
                    }
                    break;

            }
        }
        System.out.println(sb);
    }
}
