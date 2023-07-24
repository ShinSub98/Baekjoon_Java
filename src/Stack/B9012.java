package Stack;

import java.util.Scanner;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(result(s.next()));
        }
    }

    public static String result (String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push('(');
            } else if (s.charAt(i) == ')'){
                if (stack.empty()){
                    return "NO";
                } else {
                    stack.pop();
                }
            } else {return "NO";}
        }

        if (stack.empty()){
            return "YES";
        } else {
            return "NO";
        }
    }
}
