package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P03000___RightTriangle {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        Point[] p = new Point[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            p[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Map<Integer, List<Integer>> x = Arrays.stream(p)
                .collect(
                        Collectors.groupingBy(
                                point -> point.x,
                                Collectors.mapping(point -> point.y, Collectors.toList())
                        )
                );

        Map<Integer, Long> y = Arrays.stream(p)
                .collect(
                        Collectors.groupingBy(
                                point -> point.y,
                                Collectors.counting()
                        )
                );


        long count = 0;

        for (List<Integer> points : x.values()) {
            long sum = points.stream().mapToLong(it -> y.get(it) - 1).sum();
            count += sum * (points.size() - 1);
        }

        System.out.println(count);
    }

    class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            return Integer.compare(x, o.x);
        }
    }

    public static void main(String[] args) throws IOException {
        new P03000___RightTriangle().solve();
    }
}
