package baekjoon.day20160112;
import java.util.Scanner;

public class Sum3_11382 {

	public Sum3_11382() {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		for (int i = 0; i < 3; i++)
			sum += sc.nextLong();
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Sum3_11382();
	}
}
