package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P15965___KthPrimeNumber {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        boolean[] np = new boolean[10000001];
        np[0] = np[1] = true;

        for (int i = 2; i * i < np.length; i++) {
            if (!np[i]) {
                for (int j = i * i; j < np.length; j = j + i) {
                    np[j] = true;
                }
            }
        }

        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i < np.length; i++) {
            if (!np[i]) {
                prime.add(i);
            }
        }

        int n = Integer.parseInt(br.readLine()) - 1;
        System.out.println(prime.get(n));
    }

    public static void main(String[] args) throws IOException {
        new P15965___KthPrimeNumber().solve();
    }
}
