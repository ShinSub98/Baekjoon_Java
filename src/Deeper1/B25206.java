package Deeper1;
import java.util.Scanner;
public class B25206 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total_score = 0.0;
        double cnt = 0;
        for (int i = 0; i < 20; i++){
            String a = s.next();
            double credit = s.nextDouble();
            String grade = s.next();
            if (grade.equals("P")) {
                continue;
            } else {
                cnt +=credit;
                total_score += credit*score(grade);
            }
        }
        System.out.println(total_score/cnt);
    }

    static double score(String str){
        if (str.equals("A+")) {
            return 4.5;
        } else if (str.equals("A0")) {
            return 4.0;
        } else if (str.equals("B+")) {
            return 3.5;
        } else if (str.equals("B0")) {
            return 3.0;
        } else if (str.equals("C+")) {
            return 2.5;
        } else if (str.equals("C0")) {
            return 2.0;
        } else if (str.equals("D+")) {
            return 1.5;
        } else if (str.equals("D0")) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
