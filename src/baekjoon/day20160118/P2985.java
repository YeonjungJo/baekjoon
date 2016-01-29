package baekjoon.day20160118;
import java.util.Scanner;

public class P2985 {

	private int[] operand = new int[3];

	private void solve() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < operand.length; i++) {
			operand[i] = sc.nextInt();
		}

		if (operand[0] + operand[1] == operand[2]) {
			System.out.println(operand[0] + "+" + operand[1] + "=" + operand[2]);
		} else if (operand[0] * operand[1] == operand[2]) {
			System.out.println(operand[0] + "*" + operand[1] + "=" + operand[2]);
		} else if (operand[0] - operand[1] == operand[2]) {
			System.out.println(operand[0] + "-" + operand[1] + "=" + operand[2]);
		} else if (operand[0] == operand[1] - operand[2]) {
			System.out.println(operand[0] + "=" + operand[1] + "-" + operand[2]);
		} else if (operand[0] == operand[1] / operand[2]) {
			System.out.println(operand[0] + "=" + operand[1] + "/" + operand[2]);
		} else if (operand[0] / operand[1] == operand[2]) {
			System.out.println(operand[0] + "/" + operand[1] + "=" + operand[2]);
		}

	}

	public static void main(String[] args) {
		new P2985().solve();
	}
}
