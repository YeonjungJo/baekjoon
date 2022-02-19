package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11725___FindParentOfTree {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Set<Integer>> link = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Set<Integer> aDefault = link.getOrDefault(a, new HashSet<>());
            aDefault.add(b);
            link.put(a, aDefault);
            Set<Integer> bDefault = link.getOrDefault(b, new HashSet<>());
            bDefault.add(a);
            link.put(b, bDefault);
        }

        int[] parents = new int[n + 1];
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        while (!stack.isEmpty()) {
            int parentNode = stack.pop();
            Set<Integer> nodes = link.get(parentNode);
            for (Integer node : nodes) {
                if (parents[node] == 0) {
                    parents[node] = parentNode;
                    stack.add(node);
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            stringBuilder.append(parents[i]).append("\n");
        }
        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P11725___FindParentOfTree().solve();
    }
}
