package baekjoon.solve;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class P01990___NumberOfPrimeAndPalindrom {

	private static final Scanner sc = new Scanner(System.in);

	private static final int MAX = 9999;

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();

		LinkedList<Integer> palindrom = init();
		Integer[] p = palindrom.toArray(new Integer[palindrom.size()]);
		Arrays.sort(p);

		for (int i = 0; i < p.length; i++) {
			if (p[i] < a) continue;
			if (p[i] > b) break;
			if (isPrimeNumber(p[i])) System.out.println(p[i]);
		}
		System.out.println(-1);
	}

	private boolean isPrimeNumber(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	private LinkedList<Integer> init() {
		LinkedList<Integer> palindrom = new LinkedList<>();
		for (int i = 1; i <= MAX; i++) {
			if (i > 1 && i < 10) palindrom.add(i);
			else palindrom.add(getPalindromOdd(i));
			palindrom.add(getPalindromEven(i));
		}
		return palindrom;
	}

	private Integer getPalindromOdd(int n) {
		String s = Integer.toString(n);
		StringBuilder result = new StringBuilder(s);
		for (int i = 1; i < s.length(); i++)
			result.append(s.charAt(s.length() - i - 1));
		return Integer.parseInt(result.toString());
	}

	private Integer getPalindromEven(int n) {
		String s = Integer.toString(n);
		StringBuilder result = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++)
			result.append(s.charAt(s.length() - i - 1));
		return Integer.parseInt(result.toString());
	}

	public static void main(String[] args) {
		new P01990___NumberOfPrimeAndPalindrom().solve();
	}
}
