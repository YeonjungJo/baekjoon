package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P24510___DodoLearnedTimeComplexity {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int forCount = (s.length() - s.replaceAll("for", "").length()) / 3;
            int whileCount = (s.length() - s.replaceAll("while", "").length()) / 5;
            max = Math.max(max, forCount + whileCount);
        }

        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        new P24510___DodoLearnedTimeComplexity().solve();
    }
}
