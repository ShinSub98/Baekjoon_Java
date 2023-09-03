package Recursive;
import java.io.*;
public class B27433 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        System.out.println(fac(n));



    }

    static long fac(long n) {
        if (n == 0) {
            return 1;
        } else if (n > 1) {
            return n*fac(n-1);
        } else {
            return 1;
        }
    }
}
