package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P16563___DifficultPrimeFactorization {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        boolean[] np = new boolean[2500];
        np[0] = np[1] = true;

        for (int i = 2; i * i < np.length; i++) {
            if (!np[i]) {
                for (int j = i * i; j < np.length; j = j + i) {
                    np[j] = true;
                }
            }
        }

        List<Integer> prime = new ArrayList<>();
        for (int i = 0; i < np.length; i++) {
            if (!np[i]) {
                prime.add(i);
            }
        }

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(st.nextToken());
            int p = 0;
            while (target > 1 && p < prime.size()) {
                Integer primeNumber = prime.get(p);
                if (target % primeNumber == 0) {
                    target /= primeNumber;
                    stringBuilder.append(primeNumber).append(" ");
                } else {
                    p++;
                }
            }
            if (target > 1) {
                stringBuilder.append(target);
            }
            stringBuilder.append("\n");
        }

        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P16563___DifficultPrimeFactorization().solve();
    }
}
