package Geometric;
import java.util.Scanner;
public class B1085 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int w = s.nextInt();
        int h = s.nextInt();

        int garo;
        if (x > w) {
            garo = x-w;
        } else if (x > w/2){
            garo = w - x;
        } else {
            garo = x;
        }

        int sero;
        if (y > h) {
            sero = y-h;
        } else if (y > h / 2) {
            sero = h - y;
        } else {
            sero = y;
        }

        if (garo >= sero) {
            System.out.println(sero);
        } else {
            System.out.println(garo);
        }

    }
}
