package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P12852___MakeToOne2 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] count = new int[n + 1];
        int[] prev = new int[n + 1];

        Arrays.fill(count, Integer.MAX_VALUE);
        count[n] = 0;

        for (int i = n; i > 1; i--) {
            if (i % 3 == 0) {
                process(i, i / 3, count, prev);
            }
            if (i % 2 == 0) {
                process(i, i / 2, count, prev);
            }
            process(i, i - 1, count, prev);
        }

        System.out.println(count[1]);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        int i = 1;
        while (prev[i] != 0) {
            stringBuilder.insert(0, String.format("%d ", prev[i]));
            i = prev[i];
        }
        System.out.println(stringBuilder);
    }

    private void process(int current, int next, int[] dCount, int[] prev) {
        int currentCount = dCount[current];
        int nextCount = dCount[next];
        if (currentCount + 1 < nextCount) {
            dCount[next] = currentCount + 1;
            prev[next] = current;
        }
    }

    public static void main(String[] args) throws IOException {
        new P12852___MakeToOne2().solve();
    }
}
