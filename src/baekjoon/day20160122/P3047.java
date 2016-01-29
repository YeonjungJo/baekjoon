package baekjoon.day20160122;
import java.util.Arrays;
import java.util.Scanner;

public class P3047 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[3];
		for (int i = 0; i < 3; i++) {
			input[i] = sc.nextInt();
		}
		
		Arrays.sort(input);

		char[] sort = sc.next().toCharArray();

		for (int i = 0; i < sort.length; i++) {
			if(sort[i] == 'A') System.out.print(input[0] + " ");
			if(sort[i] == 'B') System.out.print(input[1] + " ");
			if(sort[i] == 'C') System.out.print(input[2] + " ");
		}
	}

	public static void main(String[] args) {
		new P3047().solve();
	}
}
