package baekjoon.solve;
import java.util.Scanner;

public class P01297___TelevisionSize {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int diagonal = sc.nextInt();
		int height = sc.nextInt();
		int width = sc.nextInt();

		double x = Math.sqrt(Math.pow(diagonal, 2) / (Math.pow(height, 2) + Math.pow(width, 2)));
		
		System.out.println((int)(x * height) + " " + (int)(x * width));
	}

	public static void main(String[] args) {
		new P01297___TelevisionSize().solve();
	}
}
