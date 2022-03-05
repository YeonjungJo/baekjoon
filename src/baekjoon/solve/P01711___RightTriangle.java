package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01711___RightTriangle {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        Point[] p = new Point[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            p[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    long a = p[i].distancePow(p[j]);
                    long b = p[i].distancePow(p[k]);
                    long c = p[j].distancePow(p[k]);

                    if (a == b + c || b == a + c || c == a + b) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public long distancePow(Point p) {
            return (long) Math.abs(p.x - x) * Math.abs(p.x - x)
                    + (long) Math.abs(p.y - y) * Math.abs(p.y - y);
        }
    }

    public static void main(String[] args) throws IOException {
        new P01711___RightTriangle().solve();
    }
}
