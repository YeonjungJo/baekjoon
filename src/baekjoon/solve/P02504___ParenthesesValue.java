package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class P02504___ParenthesesValue {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        Stack<String> stack = new Stack<>();
        AtomicBoolean valid = new AtomicBoolean(true);
        Arrays.stream(br.readLine().split(""))
                .forEach(it -> {
                    if (it.equals("[") || it.equals("(")) {
                        stack.add(it);
                    } else if (it.equals("]") || it.equals(")")) {
                        if (stack.empty()) {
                            valid.set(false);
                            return;
                        }
                        int tmp = calc(stack, it);
                        if (tmp == 0) {
                            valid.set(false);
                            return;
                        }
                        stack.add(String.valueOf(tmp));
                    } else if (isNumeric(it)) {
                        stack.add(it);
                    } else {
                        valid.set(false);
                        return;
                    }
                });

        if (!valid.get()) {
            System.out.println(0);
            return;
        }

        boolean isAllNumeric = stack.stream().allMatch(this::isNumeric);
        if (!isAllNumeric) {
            System.out.println(0);
            return;
        }

        System.out.println(stack.stream()
                .mapToInt(Integer::parseInt)
                .sum());
    }

    private int calc(Stack<String> stack, String current) {
        int tmp = 0;
        while (!stack.isEmpty()) {
            String previous = stack.pop();
            if (isNumeric(previous)) {
                tmp += Integer.parseInt(previous);
            } else if (current.equals("]")) {
                if (previous.equals("[")) {
                    return tmp == 0 ? 3 : tmp * 3;
                } else {
                    return 0;
                }
            } else {
                if (previous.equals("(")) {
                    return tmp == 0 ? 2 : tmp * 2;
                } else {
                    return 0;
                }
            }
        }
        return 0;
    }

    private boolean isNumeric(String s) {
        return s.matches("[0-9]*");
    }

    public static void main(String[] args) throws IOException {
        new P02504___ParenthesesValue().solve();
    }
}
