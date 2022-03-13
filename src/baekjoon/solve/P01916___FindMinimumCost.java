package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P01916___FindMinimumCost {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int NOT_VISIT = -1;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        PriorityQueue<Node>[] a = new PriorityQueue[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new PriorityQueue<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            a[start].add(new Node(end, w));
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] d = new int[n + 1];
        Arrays.fill(d, NOT_VISIT);
        d[start] = 0;

        while (!a[start].isEmpty()) {
            Node tmp = a[start].poll();
            if (d[tmp.to] != NOT_VISIT) {
                continue;
            }
            d[tmp.to] = tmp.w;
            for (Node node : a[tmp.to]) {
                a[start].add(new Node(node.to, node.w + tmp.w));
            }
        }

        System.out.println(d[target]);
    }

    public class Node implements Comparable<Node> {
        int to;
        int w;

        public Node(int to, int w) {
            this.to = to;
            this.w = w;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(w, o.w);
        }
    }

    public static void main(String[] args) throws IOException {
        new P01916___FindMinimumCost().solve();
    }
}
