package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P15828___Router {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        List<Integer> router = new ArrayList<>();
        int sum = 0;
        int header = 0;
        while (true) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 0) {
                header++;
                sum--;
            } else if (tmp == -1) {
                break;
            } else {
                if (sum < n) {
                    router.add(tmp);
                    sum++;
                }
            }
        }

        if (header == router.size()) {
            System.out.println("empty");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = header; i < router.size(); i++) {
            stringBuilder.append(router.get(i)).append(" ");
        }
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P15828___Router().solve();
    }
}
