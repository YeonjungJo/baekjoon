package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10464___XOR {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken());

            int result = checkEven(a, b) ? 1 : 0;

            for (int k = 2; k <= b; k *= 2) {
                if (check(a, b, k)) {
                    result += k;
                }
            }

            System.out.println(result);
        }
    }

    private boolean checkEven(int a, int b) {
        boolean da = (a / 2) % 2 == 0;
        boolean ra = (a % 2) % 2 == 0;
        boolean db = (b / 2) % 2 == 0;
        boolean rb = (b % 2) % 2 == 0;

        if (db) {
            if (da) {
                return ra != rb;
            }
            return ra == rb;
        }
        if (da) {
            return ra == rb;
        }
        return ra != rb;
    }

    private boolean check(int a, int b, int i) {
        int da = a / i;
        int ra = a % i;
        int db = b / i;
        int rb = b % i;

        if (db % 2 == 1) {
            if (da % 2 == 0) {
                return (rb % 2) == 0;
            } else {
                return (ra % 2 == 0) ^ (rb % 2 == 0);
            }
        } else {
            if (da % 2 == 0) {
                return false;
            }
            return ra % 2 == 0;
        }
    }

    public static void main(String[] args) throws IOException {
        new P10464___XOR().solve();
    }
}
