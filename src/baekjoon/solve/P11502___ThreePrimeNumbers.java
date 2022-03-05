package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P11502___ThreePrimeNumbers {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int t = Integer.parseInt(br.readLine());

        boolean[] np = new boolean[3001];
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

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            solve(np, prime, n);
        }
    }

    private void solve(boolean[] np, List<Integer> prime, int n) {
        for (int a = 0; a < prime.size(); a++) {
            for (int b = a; b < prime.size(); b++) {
                int ab = prime.get(a) + prime.get(b);
                if (ab > n) {
                    break;
                }

                if (!np[n - ab]) {
                    System.out.printf("%d %d %d\n", prime.get(a), prime.get(b), n - ab);
                    return;
                }
            }
        }

        System.out.println(0);
    }

    public static void main(String[] args) throws IOException {
        new P11502___ThreePrimeNumbers().solve();
    }
}
