package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P09613___GcdSum {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void run() throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int testcase = 0; testcase < t; testcase++) {
            solve();
        }
    }

    private void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += findGcd(a[i], a[j]);
            }
        }

        System.out.println(sum);
    }

    private int findGcd(int a, int b) {
        if (a == b) {
            return a;
        }
        int gcd = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd *= i;
                a /= i;
                b /= i;
                i--;
            }
        }
        return gcd;
    }

    public static void main(String[] args) throws IOException {
        new P09613___GcdSum().run();
    }
}
