package baekjoon.solve;
import java.util.Scanner;

public class P05656___ComparisonOperator {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		for (int i = 1;; i++) {
			String[] operation = sc.nextLine().split(" ");
			if (operation[1].equals("E")) return;
			System.out.println("Case " + i + ": " + operate(Integer.parseInt(operation[0]), Integer.parseInt(operation[2]), operation[1]));
		}
	}

	private boolean operate(int operandA, int operandB, String operator) {
		switch (operator) {
		case ">":
			return operandA > operandB ? true : false;
		case ">=":
			return operandA >= operandB ? true : false;
		case "<":
			return operandA < operandB ? true : false;
		case "<=":
			return operandA <= operandB ? true : false;
		case "==":
			return operandA == operandB ? true : false;
		case "!=":
			return operandA != operandB ? true : false;
		default:
			return true;
		}
	}

	public static void main(String[] args) {
		new P05656___ComparisonOperator().solve();
	}
}
