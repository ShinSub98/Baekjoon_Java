package Recursive;
import java.util.*;
import java.io.*;
class MergeArray {
    int[] arr;
    int[] tmp;
    int k;
    int cnt;

    MergeArray(int n, int k) {
        arr = new int[n];
        tmp = new int[n];
        this.k = k;
        cnt = 0;
    }

    public void merge_sort(int start, int last) {
        if (start < last) {
            int mid = (start+last)/2;
            merge_sort(start, mid);
            merge_sort(mid+1, last);
            merge(start, mid, last);
        }
    }

    private void merge(int start, int mid, int last) {
        int s = start;
        int m = mid+1;
        int t = 0;

        while (s <= mid & m <= last) {
            if (arr[s] < arr[m]) {
                tmp[t++] = arr[s++];
            } else {
                tmp[t++] = arr[m++];
            }
        }

        while (s <= mid) {
            tmp[t++] = arr[s++];
        }
        while (m <= last) {
            tmp[t++] = arr[m++];
        }
        for (int i = start; i <= last; i++) {
            arr[i] = tmp[i-start];
            cnt++;
            if (cnt == k) {
                System.out.println(arr[i]);
                System.exit(0);
            }
        }
    }
}


public class B24060 {
    public static void main(String[] args) throws IOException{
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        MergeArray ma = new MergeArray(n, k);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ma.arr[i] = Integer.parseInt(st.nextToken());
        }

        ma.merge_sort(0, n-1);
        System.out.println(-1);

    }
}
