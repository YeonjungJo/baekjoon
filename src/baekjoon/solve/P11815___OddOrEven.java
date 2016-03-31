package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;
 
public class P11815___OddOrEven {
 
    private static final Scanner sc = new Scanner(System.in);
 
    private void solve() {
        int testcase = sc.nextInt();
        for (int t = 0; t < testcase; t++) {
            BigInteger n = sc.nextBigInteger();
            BigInteger sqrt = sqrt(n);
            System.out.printf("%d ", sqrt.multiply(sqrt).equals(n) ? 1 : 0);
        }
    }
 
    private BigInteger sqrt(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
        while (b.compareTo(a) >= 0) {
            BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
            if (mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
            else a = mid.add(BigInteger.ONE);
        }
        return a.subtract(BigInteger.ONE);
    }
 
    public static void main(String[] args) {
        new P11815___OddOrEven().solve();
    }
}