package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P01167___TreeDiameter {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int NOT_VISIT = 0;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Node>[] a = new PriorityQueue[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = new PriorityQueue<>();
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            while (true) {
                int to = Integer.parseInt(st.nextToken());
                if (to == -1) {
                    break;
                }
                int w = Integer.parseInt(st.nextToken());
                a[from].add(new Node(to, w));
                a[to].add(new Node(from, w));
                if (from == 1) {
                    a[0].add(new Node(to, w));
                }
            }
        }

        int maxIndex = 0;
        int[] d = new int[n + 1];
        while (!a[1].isEmpty()) {
            Node node = a[1].poll();
            if (1 == node.to || d[node.to] != NOT_VISIT) {
                continue;
            }
            d[node.to] = node.w;
            if (d[node.to] > d[maxIndex]) {
                maxIndex = node.to;
            }

            for (Node k : a[node.to]) {
                a[1].add(new Node(k.to, k.w + node.w));
            }
        }

        a[1] = a[0];
        int result = 0;
        d = new int[n + 1];
        while (!a[maxIndex].isEmpty()) {
            Node node = a[maxIndex].poll();
            if (maxIndex == node.to || d[node.to] != NOT_VISIT) {
                continue;
            }
            d[node.to] = node.w;
            result = Math.max(result, d[node.to]);

            for (Node k : a[node.to]) {
                a[maxIndex].add(new Node(k.to, k.w + node.w));
            }
        }

        System.out.println(result);
    }

    public class Node implements Comparable<Node> {

        int to;
        int w;

        public Node(int b, int w) {
            this.to = b;
            this.w = w;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(w, o.w);
        }
    }

    public static void main(String[] args) throws IOException {
        new P01167___TreeDiameter().solve();
    }
}
