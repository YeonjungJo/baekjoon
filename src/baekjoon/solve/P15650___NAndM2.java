package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P15650___NAndM2 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int range = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        Queue<Stack<Integer>> result = new ArrayDeque<>();
        for (int i = 1; i <= range; i++) {
            Stack<Integer> stack = new Stack<>();
            stack.add(i);
            result.add(stack);
        }

        while (true) {
            Stack<Integer> tmp = result.peek();
            if (tmp.size() < count) {
                result.remove();
                for (int i = tmp.peek() + 1; i <= range; i++) {
                    Stack<Integer> clone = (Stack<Integer>) tmp.clone();
                    clone.add(i);
                    result.add(clone);
                }
            } else {
                break;
            }
        }

        String collect = result.stream()
                .map(it -> it.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" ")))
                .collect(Collectors.joining("\n"));
        System.out.println(collect);
    }

    public static void main(String[] args) throws IOException {
        new P15650___NAndM2().solve();
    }
}
