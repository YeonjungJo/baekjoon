package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P02143___SumOfTwoArrays {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        int t = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> da = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                da.put(sum, da.getOrDefault(sum, 0) + 1);
            }
        }

        Map<Integer, Integer> db = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = i; j < m; j++) {
                sum += b[j];
                db.put(sum, db.getOrDefault(sum, 0) + 1);
            }
        }

        long count = 0;
        for (Map.Entry<Integer, Integer> entry : da.entrySet()) {
            Integer countB = db.getOrDefault(t - entry.getKey(), 0);
            count += (long) entry.getValue() * countB;
        }

        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        new P02143___SumOfTwoArrays().solve();
    }
}
