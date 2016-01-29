package baekjoon.day20160112;
import java.util.Scanner;

public class p2420_safari {

	private void init() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(a > b ? a-b : b-a);
	}

	public static void main(String[] args) {
		new p2420_safari().init();
	}
}