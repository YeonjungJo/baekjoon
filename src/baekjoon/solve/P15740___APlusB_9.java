package baekjoon.solve;

import java.math.BigInteger;
import java.util.Scanner;

public class P15740___APlusB_9 {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        System.out.println(a.add(b));
    }

    public static void main(String[] args) {
        new P15740___APlusB_9().solve();
    }
}
