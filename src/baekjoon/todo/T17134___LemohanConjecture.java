package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class T17134___LemohanConjecture {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
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
        for (int i = 2; i < np.length; i++) {
            if (!np[i]) {
                prime.add(i);
            }
        }

        int t = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for (Integer p : prime) {
                if (2 * p >= n) {
                    break;
                }
                if (!np[(n - 2 * p)]) {
                    count++;
                }
            }
            stringBuilder.append(count).append("\n");
        }
        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new T17134___LemohanConjecture().solve();
    }
}
