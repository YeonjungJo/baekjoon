package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T10504___Add {
    // 탐색하는 부분 개선이 필요

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int t = 0; t < n; t++) {
            int target = Integer.parseInt(br.readLine());

            int resultX = 0;
            int resultY = 0;
            for (int x = target / 2; x > 0; x--) {
                for (int y = Math.min(target / 2, x - 1); y >= 0; y--) {
                    if (2 * target == (x - y) * (x + y + 1)) {
                        resultX = x;
                        resultY = y;
                        break;
                    }
                }
                if (resultX != 0) {
                    break;
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            if (resultX == 0) {
                stringBuilder.append("IMPOSSIBLE");
            } else {
                stringBuilder.append(target).append(" = ");
                for (int i = resultY + 1; i < resultX; i++) {
                    stringBuilder.append(i).append(" + ");
                }
                stringBuilder.append(resultX);
            }

            System.out.println(stringBuilder);
        }
    }

    public static void main(String[] args) throws IOException {
        new T10504___Add().solve();
    }
}
