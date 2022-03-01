package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P01271___SuperRich2 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        String[] s = br.readLine().split(" ");
        BigInteger n = new BigInteger(s[0]);
        BigInteger m = new BigInteger(s[1]);
        BigInteger[] x = n.divideAndRemainder(m);
        System.out.println(x[0]);
        System.out.println(x[1]);
    }

    public static void main(String[] args) throws IOException {
        new P01271___SuperRich2().solve();
    }
}
