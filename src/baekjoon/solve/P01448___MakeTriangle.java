package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P01448___MakeTriangle {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);

        for (int i = n - 1; i >= 2; i--) {
            if (a[i] < a[i - 1] + a[i - 2]) {
                System.out.println(a[i] + a[i - 1] + a[i - 2]);
                return;
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        new P01448___MakeTriangle().solve();
    }
}
