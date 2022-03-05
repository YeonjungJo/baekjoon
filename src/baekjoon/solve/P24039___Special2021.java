package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P24039___Special2021 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        if (n < 4) {
            System.out.println(6);
            return;
        }

        boolean[] np = new boolean[100001];
        np[0] = np[1] = true;

        for (int i = 2; i * i < np.length; i++) {
            if (!np[i]) {
                for (int j = i * i; j < np.length; j = j + i) {
                    np[j] = true;
                }
            }
        }

        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (!np[i]) {
                prime.add(i);
            }
        }

        int i = 2;
        int result = prime.get(0) * prime.get(1);
        while (result <= n) {
            result = prime.get(i - 1) * prime.get(i);
            i++;
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new P24039___Special2021().solve();
    }
}
