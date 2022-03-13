package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P06549___LargestRectangleInHistogram {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }

            stringBuilder.append(solve(n)).append("\n");
        }
        System.out.print(stringBuilder);
    }

    private long solve(int n) {
        int[] height = new int[n];
        Stack<Integer> stack = new Stack<>();
        long max = 0;
        for (int i = 0; i < n; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[stack.peek()] > height[i]) {
                int idx = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, (long) width * height[idx]);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            max = Math.max(max, (long) width * height[idx]);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        new P06549___LargestRectangleInHistogram().solve();
    }
}


