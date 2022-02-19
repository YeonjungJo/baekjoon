package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P15663___NAndM9 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        Queue<StringBuilder> result = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            StringBuilder stack = new StringBuilder();
            stack.append(i);
            result.add(stack);
        }

        while (true) {
            StringBuilder peek = result.peek();
            if (peek.toString().split(" ").length < count) {
                result.remove();
                for (int i = 0; i < n; i++) {
                    if (peek.toString().contains(String.valueOf(i))) {
                        continue;
                    }
                    StringBuilder clone = new StringBuilder(peek);
                    clone.append(" ").append(i);
                    result.add(clone);
                }
            } else {
                break;
            }
        }

        String collect = result.stream()
                .map(StringBuilder::toString)
                .map(it -> it.split(" "))
                .map(it -> Arrays.stream(it)
                        .map(Integer::parseInt)
                        .map(o -> a[o])
                        .map(String::valueOf)
                        .collect(Collectors.joining(" ")))
                .distinct()
                .collect(Collectors.joining("\n"));
        System.out.println(collect);
    }

    public static void main(String[] args) throws IOException {
        new P15663___NAndM9().solve();
    }
}
