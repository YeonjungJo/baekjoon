package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P04149___CharacterRecognition {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int totalCount = 0;
            int recognitionCount = 0;
            while (true) {
                String s = br.readLine();
                if (s.trim().isEmpty()) {
                    break;
                }
                totalCount += s.length();
                recognitionCount += s.replaceAll("#", "").length();
            }

            double result = ((double) recognitionCount / totalCount) * 100.0;
            DecimalFormat df = new DecimalFormat("#.#");
            System.out.println("Efficiency ratio is " + df.format(result) + "%.");
        }
    }

    public static void main(String[] args) throws IOException {
        new P04149___CharacterRecognition().solve();
    }
}
