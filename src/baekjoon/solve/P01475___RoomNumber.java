package baekjoon.solve;
import java.util.Scanner;

public class P01475___RoomNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] numbers = new int[10];

		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			int tmp = Character.getNumericValue(s.charAt(i));
			if (tmp == 6) {
				if (numbers[9] < numbers[6]) numbers[9]++;
				else numbers[6]++;
			} else if (tmp == 9) {
				if (numbers[9] > numbers[6]) numbers[6]++;
				else numbers[9]++;
			} else {
				numbers[tmp]++;
			}
		}

		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			max = numbers[i] > max ? numbers[i] : max;
		}
		
		System.out.println(max);
	}

	public static void main(String[] args) {
		new P01475___RoomNumber().solve();
	}
}
