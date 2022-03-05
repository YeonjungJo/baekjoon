package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P02824___GCD {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        boolean[] np = new boolean[40000];
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

        List<Integer> factors = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            for (int k = 0; tmp > 1 && k < prime.size(); k++) {
                int p = prime.get(k);
                if (tmp % p == 0) {
                    tmp /= p;
                    k--;
                    factors.add(p);
                }
            }
            if (tmp > 1) {
                factors.add(tmp);
            }
        }

        boolean over = false;
        int m = Integer.parseInt(br.readLine());
        long result = 1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            for (int j = 0; j < factors.size(); j++) {
                Integer p = factors.get(j);
                if (tmp % p == 0) {
                    tmp /= p;
                    result *= p;
                    if (result >= 1000000000) {
                        result %= 1000000000;
                        over = true;
                    }
                    factors.set(j, 1);
                }
            }
        }

        if (over) {
            System.out.printf("%09d", result);
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException {
        new P02824___GCD().solve();
    }
}
