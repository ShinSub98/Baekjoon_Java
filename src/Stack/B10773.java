package Stack;

import java.util.Scanner;
public class B10773 {
    static int[] stack;
    static int end = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        stack = new int[k];

        for (int i=0; i < k; i++){
            int n = scanner.nextInt();


            if (n == 0){
                pop();
            } else {
                push(n);
            }
        }
        int sum = 0;
        for (int i=0; i<end;i++){
            sum += stack[i];
        }
        System.out.println(sum);
    }


    public static void push(int x){
        stack[end] = x;
        end ++;
    }

    public static void pop(){
        end -= 1;
        stack[end] = 0;
    }

}
