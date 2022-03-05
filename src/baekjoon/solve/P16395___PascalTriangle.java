package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16395___PascalTriangle {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()) - 1;
        int k = Integer.parseInt(st.nextToken()) - 1;

        int r = Math.min(n - k, k);

        long result = 1;
        for (int i = n - r + 1; i <= n; i++) {
            result *= i;
        }
        for (int i = 1; i <= r; i++) {
            result /= i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new P16395___PascalTriangle().solve();
    }
}
