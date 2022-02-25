package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12605___ReverseWord {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            result.append("Case #").append(i + 1).append(": ");
            for (int i1 = s.length - 1; i1 >= 0; i1--) {
                result.append(s[i1]).append(" ");
            }
            result.append("\n");
        }
        System.out.print(result);
    }

    public static void main(String[] args) throws IOException {
        new P12605___ReverseWord().solve();
    }
}
