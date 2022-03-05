package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01111___IQTest {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(st.nextToken());
        }

        if (n <= 1) {
            System.out.println("A");
            return;
        }
        if (d[0] == d[1]) {
            for (int i = 1; i < n; i++) {
                if (d[0] != d[i]) {
                    System.out.println("B");
                    return;
                }
            }
            System.out.println(d[0]);
            return;
        }
        if (n == 2) {
            System.out.println("A");
            return;
        }

        int a = (d[2] - d[1]) / (d[1] - d[0]);
        int b = d[1] - d[0] * a;

        for (int i = 1; i < n; i++) {
            if (d[i - 1] * a + b != d[i]) {
                System.out.println("B");
                return;
            }
        }
        System.out.println(d[n - 1] * a + b);
    }

    public static void main(String[] args) throws IOException {
        new P01111___IQTest().solve();
    }
}
