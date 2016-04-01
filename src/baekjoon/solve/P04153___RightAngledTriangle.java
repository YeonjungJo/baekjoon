package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P04153___RightAngledTriangle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int[] t = new int[3];
			for (int i = 0; i < 3; i++) {
				t[i] = sc.nextInt();
			}
			if (t[0] == 0 && t[1] == 0 && t[2] == 0) return;
			
			Arrays.sort(t);
			if(Math.pow(t[0], 2) + Math.pow(t[1], 2) == Math.pow(t[2],2)) System.out.println("right");
			else System.out.println("wrong");
		}
	}

	public static void main(String[] args) {
		new P04153___RightAngledTriangle().solve();
	}
}
