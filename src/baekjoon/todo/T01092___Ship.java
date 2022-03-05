package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class T01092___Ship {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] crane = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            crane[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] d = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            for (int j = 0; j < n; j++) {
                if (crane[j] >= tmp) {
                    d[j]++;
                }
            }
        }

        Arrays.sort(d);

        if (d[n - 1] < m) {
            System.out.println(-1);
            return;
        }

        int day = 0;
        while (true) {
            day++;
            int count = 0;
            for (int i = 0; i < n; i++) {
                int min = Math.min(d[i], d[n - 1]) - count;
                d[i] = min - 1;
                if (min > 0) {
                    count++;
                }
            }
            if (d[n - 1] <= 0) {
                break;
            }
        }
        System.out.println(day);
    }

    public static void main(String[] args) throws IOException {
        new T01092___Ship().solve();
    }
}
