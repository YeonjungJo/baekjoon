package baekjoon.solve;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class P01016___NotSquareNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		BigInteger min = sc.nextBigInteger();
		BigInteger max = sc.nextBigInteger();

		boolean[] d = new boolean[max.subtract(min).intValue() + 1];

		search(d, min, max);

		int count = 0;
		for (int i = 0; i < d.length; i++) {
			if (!d[i]) count++;
		}

		System.out.println(count);
	}

	private void search(boolean[] d, BigInteger min, BigInteger max) {
		LinkedList<BigInteger> primeNumbers = new LinkedList<>();

		BigInteger p = new BigInteger("1");

		while (true) {
			p = getNextPrimeNumber(p, primeNumbers);
			BigInteger square = p.pow(2);
			if (square.compareTo(max) == 1) return;
			update(d, square, min, max.subtract(min));
		}
	}

	// 1000000000000 1000001000000
	private BigInteger getNextPrimeNumber(BigInteger p, LinkedList<BigInteger> primeNumbers) {
		while (true) {
			p = p.add(BigInteger.ONE);
			if (isPrimeNumber(p, primeNumbers)) return p;
		}
	}

	private boolean isPrimeNumber(BigInteger p, LinkedList<BigInteger> primeNumbers) {
		for (int i = 0; i < primeNumbers.size(); i++) {
			if (p.mod(primeNumbers.get(i)).equals(BigInteger.ZERO)) return false;
		}
		return true;
	}

	private void update(boolean[] d, BigInteger square, BigInteger min, BigInteger arrSize) {
		BigInteger start = min.divide(square);
		if (!min.mod(square).equals(BigInteger.ZERO)) start = start.add(BigInteger.ONE);
		start = start.multiply(square).subtract(min);

		while (start.compareTo(arrSize) != 1) {
			d[start.intValue()] = true;
			start = start.add(square);
		}
	}

	public static void main(String[] args) {
		new P01016___NotSquareNumber().solve();
	}
}
