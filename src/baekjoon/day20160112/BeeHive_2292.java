package baekjoon.day20160112;
import java.util.Scanner;

public class BeeHive_2292 {

	public BeeHive_2292() {
		scan();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		operate(sc.nextInt());
	}

	private void operate(int input) {
		int count = 1;
		for (int i = 1; input > 1; i++) {
			input -= 6 * i;
			count++;
		}
		print(count);
	}

	private void print(int result) {
		System.out.println(result);
	}

	public static void main(String[] args) {
		new BeeHive_2292();
	}
}
