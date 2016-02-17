package baekjoon.solve;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class P01755___NumberGame {

	private static final Scanner sc = new Scanner(System.in);

	private static final String[] NUMBER = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	private void solve() {
		int start = sc.nextInt();
		int end = sc.nextInt();

		LinkedList<String> numbers = new LinkedList<String>();
		for (int i = start; i <= end; i++) {
			StringBuilder tmp = new StringBuilder();
			int k = i;
			if (k >= 10) {
				tmp.append(NUMBER[k / 10]).append(" ");
				k %= 10;
			}
			tmp.append(NUMBER[k]);
			numbers.add(tmp.toString());
		}

		String[] result = numbers.toArray(new String[numbers.size()]);
		Arrays.sort(result);
		for (int i = 0; i < result.length; i++) {
			String[] trans = result[i].split(" ");
			System.out.print(getNumber(trans)+ " ");
			if(i % 10 == 9) System.out.println();
		}
	}

	private String getNumber(String[] trans) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < trans.length; i++) {
			for (int j = 0; j < 10; j++) {
				if(trans[i].equals(NUMBER[j])) {
					strBuilder.append(j);
					break;
				}
			}
		}
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		new P01755___NumberGame().solve();
	}
}
