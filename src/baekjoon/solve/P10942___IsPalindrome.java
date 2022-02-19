package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10942___IsPalindrome {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        boolean[][] d = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            isPalindrome(d, a, i, i);
            isPalindrome(d, a, i, i + 1);
        }

        StringBuilder stringBuilder = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;
            stringBuilder.append(d[from][to] ? 1 : 0).append("\n");
        }

        System.out.print(stringBuilder);
    }

    private void isPalindrome(boolean[][] d, int[] a, int from, int to) {
        if (from < 0 || to >= a.length) {
            return;
        }
        if (a[from] == a[to]) {
            d[from][to] = true;
            isPalindrome(d, a, from - 1, to + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        new P10942___IsPalindrome().solve();
    }
}
