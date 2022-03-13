package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P17626___FourSquares {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final int MAX_VALUE = 5;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] d = new int[n + 1];
        Arrays.fill(d, MAX_VALUE);
        List<Integer> squared = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squared.add(i * i);
        }

        for (Integer i : squared) {
            int tmp = i;
            for (int j = 1; j < MAX_VALUE && tmp <= n; j++) {
                d[i] = Math.min(j, d[i]);
            }
        }

        for (int i = 1; i <= n; i++) {
            for (Integer s : squared) {
                if (i + s > n) {
                    break;
                }
                d[i + s] = Math.min(d[i + s], d[i] + 1);
            }
        }

        System.out.println(d[n]);
    }

    public static void main(String[] args) throws IOException {
        new P17626___FourSquares().solve();
    }
}
