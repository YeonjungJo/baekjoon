package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P06219___PrimeQualification {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String d = st.nextToken();

        boolean[] np = new boolean[4000001];
        np[0] = np[1] = true;

        for (int i = 2; i * i < np.length; i++) {
            if (!np[i]) {
                for (int j = i * i; j < np.length; j = j + i) {
                    np[j] = true;
                }
            }
        }

        long result = 0;
        for (int i = a; i <= b; i++) {
            if (!np[i]) {
                result = result + (count(i, d) ? 1 : 0);
            }
        }

        System.out.println(result);
    }

    private boolean count(int i, String d) {
        String s = String.valueOf(i);
        return s.length() != s.replaceAll(d, "").length();
    }

    public static void main(String[] args) throws IOException {
        new P06219___PrimeQualification().solve();
    }
}
