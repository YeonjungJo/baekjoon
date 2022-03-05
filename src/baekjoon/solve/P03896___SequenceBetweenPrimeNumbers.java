package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P03896___SequenceBetweenPrimeNumbers {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        boolean[] np = new boolean[1299710];
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

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            solve(prime);
        }
    }

    private void solve(List<Integer> prime) throws IOException {
        int target = Integer.parseInt(br.readLine());
        int j = 0;
        for (; target >= prime.get(j); j++) {
            if (target == prime.get(j)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(prime.get(j) - prime.get(j - 1));
    }

    public static void main(String[] args) throws IOException {
        new P03896___SequenceBetweenPrimeNumbers().solve();
    }
}
