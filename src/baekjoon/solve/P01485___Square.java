package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01485___Square {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int n = 0; n < t; n++) {
            Point[] points = new Point[4];
            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            double d1 = getLengthSquare(points[0], points[1]);
            double d2 = getLengthSquare(points[0], points[2]);
            double d3 = getLengthSquare(points[0], points[3]);
            if (d1 == d2 && d1 == d3) {
                System.out.println(0);
                continue;
            }
            if (d1 == d2 && d1 * 2 == d3) {
                if (getLengthSquare(points[1], points[3]) == getLengthSquare(points[2], points[3])) {
                    System.out.println(1);
                    continue;
                }
            }
            if (d2 == d3 && d2 * 2 == d1) {
                if (getLengthSquare(points[1], points[2]) == getLengthSquare(points[1], points[3])) {
                    System.out.println(1);
                    continue;
                }
            }
            if (d1 == d3 && d1 * 2 == d2) {
                if (getLengthSquare(points[1], points[2]) == getLengthSquare(points[2], points[3])) {
                    System.out.println(1);
                    continue;
                }
            }
            System.out.println(0);
        }
    }

    private double getLengthSquare(Point a, Point b) {
        return Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2);
    }

    private class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) throws IOException {
        new P01485___Square().solve();
    }
}
