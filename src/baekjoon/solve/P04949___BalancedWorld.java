package baekjoon.solve;

import java.util.Scanner;
import java.util.Stack;

public class P04949___BalancedWorld {

    private static final Scanner sc = new Scanner(System.in);

    public static final String END_OF_INPUT = ".";
    public static final char LEFT_PARENTHESIS = '(';
    public static final char RIGHT_PARENTHESIS = ')';
    public static final char LEFT_BRACKET = '[';
    public static final char RIGHT_BRACKET = ']';

    private void solve() {
        while (true) {
            String input = sc.nextLine();
            if (input.equals(END_OF_INPUT)) {
                return;
            }

            System.out.println(validate(input) ? "yes" : "no");
        }
    }

    private boolean validate(String input) {
        Stack<Character> stack = new Stack<>();
        for (char i : input.toCharArray()) {
            if (i == LEFT_PARENTHESIS || i == LEFT_BRACKET) {
                stack.add(i);
            } else if (i == RIGHT_PARENTHESIS) {
                if (stack.empty() || stack.pop() != LEFT_PARENTHESIS) {
                    return false;
                }
            } else if (i == RIGHT_BRACKET) {
                if (stack.empty() || stack.pop() != LEFT_BRACKET) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        new P04949___BalancedWorld().solve();
    }
}
