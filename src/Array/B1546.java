package Array;

import java.util.Scanner;
public class B1546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] array = new double[n];

        int max = 0;
        for (int i = 0; i < n; i++){
            int k = s.nextInt();
            array[i] = k;
            if (k > max) {
                max = k;
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++){
            array[i] = array[i]/max*100;
            sum += array[i];
        }

        System.out.println(sum/n);

    }
}
