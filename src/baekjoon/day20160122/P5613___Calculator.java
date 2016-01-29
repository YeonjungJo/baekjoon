package baekjoon.day20160122;
import java.util.Scanner;

public class P5613___Calculator {

	private enum Operator {
		PLUS, MINUS, MULTIPLE, DIVIDE;
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		Operator operator = null;
		
		while (true) {
			String input = sc.next();
			
			if(input.equals("=")){
				System.out.println(result);
				return;
			}

			switch (input) {
			case "+":
				operator = Operator.PLUS;
				break;
			case "-":
				operator = Operator.MINUS;
				break;
			case "*":
				operator = Operator.MULTIPLE;
				break;
			case "/":
				operator = Operator.DIVIDE;
				break;
			default:
				result = operate(result, operator, Integer.parseInt(input));
				break;
			}
		}
	}

	private int operate(int result, Operator operator, int operand) {
		if(operator == null) return operand;
		switch (operator) {
		case DIVIDE:
			return result / operand; 
		case MINUS:
			return result - operand;
		case MULTIPLE:
			return result * operand;
		case PLUS:
			return result + operand;
		default:
			return operand;
		}
	}

	public static void main(String[] args) {
		new P5613___Calculator().solve();
	}
}
