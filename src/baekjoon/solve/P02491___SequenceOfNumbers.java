package baekjoon.solve;
import java.util.Scanner;

public class P02491___SequenceOfNumbers {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}

		int max = 0;
		int equal = 0;
		int tmp = 0;
		boolean increment = true;
		for (int i = 0; i < n - 1; i++) {
			if (data[i] - data[i + 1] > 0 && increment) {
				increment = false;
				tmp = equal;
			} else if (data[i] - data[i + 1] < 0 && !increment) {
				increment = true;
				tmp = equal;
			}
			if (data[i] - data[i + 1] == 0) {
				equal++;
				tmp++;
				max = tmp > max ? tmp : max;
			}
			if (data[i] - data[i + 1] > 0 && !increment) {
				equal = 0;
				tmp++;
				max = tmp > max ? tmp : max;
			}
			if (data[i] - data[i + 1] < 0 && increment) {
				equal = 0;
				tmp++;
				max = tmp > max ? tmp : max;
			}
//			System.out.printf("%d --> %d | tmp : %d, equal : %d, max : %d\n", data[i], data[i + 1], tmp, equal, max);
		}
		System.out.println(max + 1);
	}

	public static void main(String[] args) {
		new P02491___SequenceOfNumbers().solve();
	}
}
