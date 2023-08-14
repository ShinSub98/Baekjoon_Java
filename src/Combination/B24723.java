package Combination;
import java.io.*;
public class B24723 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(2,n));
    }
}
