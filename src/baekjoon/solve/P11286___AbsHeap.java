package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class P11286___AbsHeap {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        Comparator<Integer> comparing = Comparator.comparing(Math::abs);
        Queue<Integer> queue = new PriorityQueue<>(
                comparing.thenComparing(Integer::intValue)
        );

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                Integer k = queue.poll();
                stringBuilder.append(k == null ? 0 : k).append("\n");
            } else {
                queue.add(input);
            }
        }

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P11286___AbsHeap().solve();
    }
}
