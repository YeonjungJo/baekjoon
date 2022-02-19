package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11651___SortingCoordinates2 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        Point[] p = new Point[n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            p[i] = new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }

        Arrays.sort(p);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(p[i]).append("\n");
        }
        System.out.print(stringBuilder);
    }

    private class Point implements Comparable<Point> {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return String.format("%d %d", getX(), getY());
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.getX() && this.y == o.getY()) return 0;
            if (this.y < o.getY() || (this.y == o.getY() && this.x < o.getX())) return -1;
            return 1;
        }
    }

    public static void main(String[] args) throws IOException {
        new P11651___SortingCoordinates2().solve();
    }
}
