package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01701___Cubeditor {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        String s = br.readLine();
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int tmp = i == 0 ? 0 : d[i - 1];
            d[i] = tmp;
            for (int j = tmp + i + 1; j < s.length(); j++) {
                String subString = s.substring(i, j);
                if (validate(s, i, subString)) {
                    d[i] = j - i;
                } else {
                    break;
                }
            }
        }
        System.out.println(d[s.length() - 1]);
    }

    private boolean validate(String s, int j, String subString) {
        return s.indexOf(subString, j + 1) != -1;
    }

    public static void main(String[] args) throws IOException {
        new P01701___Cubeditor().solve();
    }
}
