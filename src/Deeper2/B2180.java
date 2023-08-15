package Deeper2;
import java.util.*;
import java.io.*;
public class B2180 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            arr[i] = m;
            sum += m;

            if (hm.containsKey(m)) {
                hm.put(m, hm.get(m)+1);
            } else {
                hm.put(m, 1);
            }
        }
        Arrays.sort(arr);

        double average = sum/n;

        // 산술 평균
        System.out.println(Math.round(average));

        // 중앙값
        System.out.println(arr[n/2]);

        // 최빈값
        System.out.println(mode(hm));

        // 범위
        System.out.println(arr[n-1] - arr[0]);

    }

    static int mode(HashMap<Integer, Integer> hm) {
        int max_mode = Collections.max(hm.values());

        ArrayList<Integer> arr = new ArrayList<>();

        for (Integer key : hm.keySet()) {
            if (hm.get(key).equals(max_mode)) {
                arr.add(key);
            }
        }

        arr.sort(Comparator.naturalOrder());

        if (arr.size() == 1) {
            return arr.get(0);
        } else {
            return arr.get(1);
        }
    }
}
