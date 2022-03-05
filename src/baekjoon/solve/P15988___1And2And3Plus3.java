package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15988___1And2And3Plus3 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] d = new long[1000001];
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;
        for (int i = 4; i < 1000001; i++) {
            d[i] = (d[i - 3] + d[i - 2] + d[i - 1]) % 1000000009;
        }
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            System.out.println(d[target]);
        }
    }

    public static void main(String[] args) throws IOException {
        new P15988___1And2And3Plus3().solve();
    }
}
