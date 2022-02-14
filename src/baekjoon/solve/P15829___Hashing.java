package baekjoon.solve;

import java.math.BigInteger;
import java.util.Scanner;

public class P15829___Hashing {

    private static final Scanner sc = new Scanner(System.in);

    public static final BigInteger M = BigInteger.valueOf(1234567891);
    public static final BigInteger R = BigInteger.valueOf(31);

    private void solve() {
        int n = sc.nextInt();
        char[] input = sc.next().toCharArray();
        BigInteger hash = BigInteger.ZERO;
        BigInteger pow = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            int character = input[i] - 'a' + 1;
            BigInteger tmp = pow.multiply(BigInteger.valueOf(character));
            hash = hash.add(tmp);
            pow = pow.multiply(R);
        }
        System.out.println(hash.mod(M));
    }

    public static void main(String[] args) {
        new P15829___Hashing().solve();
    }
}
