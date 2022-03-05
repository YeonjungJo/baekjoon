package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12904___AandB {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        String s = br.readLine();
        String t = br.readLine();

        System.out.println(validate(s, t) ? 1 : 0);
    }

    private boolean validate(String s, String t) {
        if (s.length() == t.length()) {
            return s.equals(t);
        }

        if (t.endsWith("A")) {
            return validate(s, t.substring(0, t.length() - 1));
        } else {
            return validate(s, new StringBuilder(t.substring(0, t.length() - 1)).reverse().toString());
        }
    }

    public static void main(String[] args) throws IOException {
        new P12904___AandB().solve();
    }
}
