package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17103___GoldbachPartition {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int t = Integer.parseInt(br.readLine());

        boolean[] np = new boolean[1000001];
        np[0] = np[1] = true;

        for (int i = 2; i * i < np.length; i++) {
            if (!np[i]) {
                for (int j = i * i; j < np.length; j = j + i) {
                    np[j] = true;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            for (int k = 2; k <= n / 2; k++) {
                if (!np[k] && !np[n - k]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) throws IOException {
        new P17103___GoldbachPartition().solve();
    }
}
