package baekjoon.solve;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P11279___MaxHeap {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k == 0) {
                System.out.println(queue.isEmpty() ? 0 : queue.poll());
            } else {
                queue.add(k);
            }
        }
    }


    public static void main(String[] args) {
        new P11279___MaxHeap().solve();
    }
}
