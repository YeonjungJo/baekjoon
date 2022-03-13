package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P01238___Party {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        PriorityQueue<Node>[] a = new PriorityQueue[n + 1];
        PriorityQueue<Node>[] b = new PriorityQueue[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new PriorityQueue<>();
            b[i] = new PriorityQueue<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            a[from].add(new Node(to, w));
            b[to].add(new Node(from, w));
        }

        int[] da = new int[n + 1];
        while (!a[target].isEmpty()) {
            Node node = a[target].poll();
            if (da[node.to] != 0 || node.to == target) {
                continue;
            }
            da[node.to] = node.w;
            for (Node tmp : a[node.to]) {
                a[target].add(new Node(tmp.to, tmp.w + node.w));
            }
        }

        int[] db = new int[n + 1];
        while (!b[target].isEmpty()) {
            Node node = b[target].poll();
            if (db[node.to] != 0 || node.to == target) {
                continue;
            }
            db[node.to] = node.w;
            for (Node tmp : b[node.to]) {
                b[target].add(new Node(tmp.to, tmp.w + node.w));
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(da[i] + db[i], max);
        }
        System.out.println(max);
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
            return Integer.compare(this.w, o.w);
        }
    }

    public static void main(String[] args) throws IOException {
        new P01238___Party().solve();
    }
}
