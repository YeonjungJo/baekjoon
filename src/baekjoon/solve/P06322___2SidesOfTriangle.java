package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class P06322___2SidesOfTriangle {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st;
        for (int i = 1; ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                return;
            }

            DecimalFormat decimalFormat = new DecimalFormat("0.000");

            System.out.println("Triangle #" + i);
            if (a == -1) {
                if (c <= b) {
                    System.out.println("Impossible.\n");
                    continue;
                }
                double result = Math.sqrt(c * c - b * b);
                System.out.println("a = " + decimalFormat.format(result));
            } else if (b == -1) {
                if (c <= a) {
                    System.out.println("Impossible.\n");
                    continue;
                }
                double result = Math.sqrt(c * c - a * a);
                System.out.println("b = " + decimalFormat.format(result));
            } else {
                double result = Math.sqrt(a * a + b * b);
                System.out.println("c = " + decimalFormat.format(result));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        new P06322___2SidesOfTriangle().solve();
    }
}
