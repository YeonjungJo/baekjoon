package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P01153___FourPrimeNumbers {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        boolean[] np = new boolean[1000001];
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

        for (int a = 0; a < prime.size(); a++) {
            for (int b = a; b < prime.size(); b++) {
                int ab = prime.get(a) + prime.get(b);
                if (ab > n) {
                    break;
                }
                for (int c = b; c < prime.size(); c++) {
                    int abc = ab + prime.get(c);
                    if (abc > n) {
                        break;
                    }
                    if (!np[n - abc]) {
                        System.out.printf("%d %d %d %d\n", prime.get(a), prime.get(b), prime.get(c), n - abc);
                        return;
                    }
                }
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        new P01153___FourPrimeNumbers().solve();
    }
}
