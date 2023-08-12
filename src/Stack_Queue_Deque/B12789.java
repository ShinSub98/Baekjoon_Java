package Stack_Queue_Deque;
import java.util.Scanner;
public class B12789 {
    public static void main(String[] args) {
        int n;
        int[] arr1;
        int[] arr2;
        int pos1;
        int pos2 = -1;
        int order = 1;
        boolean check;
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        pos1 = n-1;
        arr1 = new int[n];
        arr2 = new int[n];

        for (int i = n-1; i >= 0; i--) {
            arr1[i] = s.nextInt();
        }

        while(true) {
            if (pos1 != -1) { // 1번 줄에 사람이 있을 때
                if (arr1[pos1] == order) { // 1번 줄에서 받아갈 때
                    pos1--;
                    order++;
                } else if (pos2 != -1) { // 2번 줄에 사람이 있을 때
                    if (arr2[pos2] == order) { // 2번 줄에서 받아갈 때
                        pos2--;
                        order++;
                    } else { // 2번 줄에서 받아가지 않을 때
                        arr2[++pos2] = arr1[pos1--]; // 2번 줄로 이동
                    }
                } else { // 2번 줄에 사람이 없을 때
                    arr2[++pos2] = arr1[pos1--]; // 2번 줄로 이동
                }
            } else { // 1번 줄에 사람이 없을 때
                if (pos2 != -1) { // 2번 줄에 사람이 있을 때
                    if (arr2[pos2] == order) { // 2번 줄에서 받아갈 때
                        pos2--;
                        order++;
                    } else { // 2번 줄에서 못 받을 때
                        check = false;
                        break;
                    }
                } else {
                    check = true;
                    break;
                }
            }
        }

        if (check == true) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

    }
}
