package Recursive;
import java.io.*;

public class B4779 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int n = Integer.parseInt(br.readLine());
                System.out.println(cantor((int) Math.pow(3, n)));
            } catch (Exception e){
                System.exit(0);
            }

        }


    }

    static String cantor(int n) {
        if (n == 1 | n == 0) {
            return "-";
        }else {
            String blanks = " ".repeat(n / 3);
            return cantor(n/3) + blanks + cantor(n/3);
        }
    }
}
