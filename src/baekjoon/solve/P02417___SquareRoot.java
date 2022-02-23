package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02417___SquareRoot {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        long n = Long.parseLong(br.readLine());
        long sqrt = (long) Math.sqrt(n);
        long square = sqrt * sqrt;
        System.out.println(sqrt + (square >= n ? 0 : 1));
    }

    public static void main(String[] args) throws IOException {
        new P02417___SquareRoot().solve();
    }
}
