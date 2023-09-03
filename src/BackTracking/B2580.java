package BackTracking;
import java.util.*;
import java.io.*;
public class B2580 {
    public static int[][] arr = new int[9][9]; // [가로][세로]

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int k = 0; k < 9; k++) {
                arr[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);
    }

    static boolean promising(int idx1, int idx2) {
        int value = arr[idx1][idx2];
        for (int i = 0; i < 9; i++) {
            if (i != idx1 & arr[i][idx2] == value) {
                return false;
            }
            if (i != idx2 & arr[idx1][i] == value) {
                return false;
            }
        }

        int row;
        int col;
        if (0 <= idx1 & idx1 <= 2) {
            row = 0;
        } else if (3 <= idx1 & idx1 <= 5) {
            row = 3;
        } else {
            row = 6;
        }
        if (0 <= idx2 & idx2 <= 2) {
            col = 0;
        } else if (3 <= idx2 & idx2 <= 5) {
            col = 3;
        } else {
            col = 6;
        }

        for (int i = row; i <= row+2; i++) {
            for (int k = col; k <= col+2; k++) {
                if (idx1 != i & idx2 != k) {
                    if (arr[i][k] == value) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static void sudoku(int idx1, int idx2) {
        if (idx1 == 9) {
            StringBuilder sb = new StringBuilder();
            for (int[] i : arr) {
                for (int k : i) {
                    sb.append(k).append(' ');
                }
                sb.append('\n');
            }
            System.out.print(sb);
            System.exit(0);
        } else {
            if (idx2 == 9) {
                sudoku(idx1+1, 0);
            } else {
                if (arr[idx1][idx2] == 0) {
                    for (int i = 1; i <= 9; i++) {
                        arr[idx1][idx2] = i;
                        if (promising(idx1, idx2)) {
                            sudoku(idx1, idx2+1);
                        }
                        arr[idx1][idx2] = 0;
                    }
                } else {
                    sudoku(idx1, idx2+1);
                }
            }
        }
    }

}
