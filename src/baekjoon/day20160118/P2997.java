package baekjoon.day20160118;
import java.util.Arrays;
import java.util.Scanner;

public class P2997 {

	private int[] input = new int[3];

	private void solve() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);

		int gap = input[1] - input[0] > input[2] - input[1] ? input[2] - input[1] : input[1] - input[0];
		if(input[0] + gap != input[1]) System.out.println(input[0] + gap);
		else if (input[1] + gap != input[2]) System.out.println(input[1] + gap);
		else System.out.println(input[2] + gap);
	}

	public static void main(String[] args) {
		new P2997().solve();
	}
}
