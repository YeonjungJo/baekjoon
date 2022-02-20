package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class P01064___Parallelogram {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int a;
        int b;
        if (x[0] >= x[1]) {
            a = 0;
            b = 1;
        } else {
            a = 1;
            b = 0;
        }

        int xdiff = x[a] - x[b];
        int ydiff = y[a] - y[b];

        if (x[0] >= x[2]) {
            a = 0;
            b = 2;
        } else {
            a = 2;
            b = 0;
        }

        int xdiff2 = x[a] - x[b];
        int ydiff2 = y[a] - y[b];

        if (xdiff * ydiff2 == xdiff2 * ydiff) {
            System.out.println(-1);
            return;
        }

        double l1 = getLength(x, y, 0, 1) + getLength(x, y, 0, 2);
        double l2 = getLength(x, y, 0, 1) + getLength(x, y, 1, 2);
        double l3 = getLength(x, y, 0, 2) + getLength(x, y, 1, 2);

        System.out.println(max(max(l1, l2), l3) - min(min(l1, l2), l3));
    }

    private Double getLength(int[] x, int[] y, int i, int j) {
        int diffX = abs(x[i] - x[j]);
        int diffY = abs(y[i] - y[j]);

        return sqrt(pow(diffX, 2) + pow(diffY, 2)) * 2;
    }

    public static void main(String[] args) throws IOException {
        new P01064___Parallelogram().solve();
    }
}
