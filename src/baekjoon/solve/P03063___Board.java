package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P03063___Board {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()); // 왼쪽아래
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken()); // 오른쪽 위
            int y2 = Integer.parseInt(st.nextToken());

            int x3 = Integer.parseInt(st.nextToken());
            int y3 = Integer.parseInt(st.nextToken());
            int x4 = Integer.parseInt(st.nextToken());
            int y4 = Integer.parseInt(st.nextToken());

            int s = (x2 - x1) * (y2 - y1);
            int x;
            int y;
            if (x1 >= x3) {
                x = (Math.min(x4, x2)) - x1;
            } else {
                x = (Math.min(x4, x2)) - x3;
            }
            if (y1 >= y3) {
                y = (Math.min(y4, y2)) - y1;
            } else {
                y = (Math.min(y4, y2)) - y3;
            }

            System.out.println(s - (x < 0 || y < 0 ? 0 : x * y));
        }
    }

    public static void main(String[] args) throws IOException {
        new P03063___Board().solve();
    }
}
