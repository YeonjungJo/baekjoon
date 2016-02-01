package baekjoon.solve;
import java.util.Scanner;

public class P10101___MemorizeTriangle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a + b + c != 180) System.out.println("Error");
		else if (a == b && b == c) System.out.println("Equilateral");
		else if (a != b && b != c && a != c) System.out.println("Scalene");
		else System.out.println("Isosceles");
	}

	public static void main(String[] args) {
		new P10101___MemorizeTriangle().solve();
	}
}
