package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T11444___Fibonacci6 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        long n = Long.parseLong(br.readLine());

        if (n <= 1) {
            System.out.println(n);
            return;
        }

        int[] f = {0, 1};
        for (long i = 0; i < n; i++) {
            f[(int) (i % 2)] = (f[0] + f[1]) % 1_000_000_007;
        }

        System.out.println(f[(int) (n % 2)]);
    }

    public static void main(String[] args) throws IOException {
        new T11444___Fibonacci6().solve();
    }
}
// 1000000000000000000