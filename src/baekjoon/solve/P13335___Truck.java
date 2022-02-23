package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P13335___Truck {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final int EMPTY = 0;

    private void solve() throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int l = Integer.parseInt(s[2]);

        List<Integer> trucks = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int time = 0;
        int done = 0;
        int sum = 0;
        List<Integer> bridge = new ArrayList<>();
        while (done != n) {
            time++;
            if (bridge.size() == w) {
                Integer remove = bridge.remove(0);
                sum -= remove;
                if (remove != EMPTY) {
                    done++;
                }
            }
            if (trucks.isEmpty()) {
                bridge.add(EMPTY);
            } else {
                Integer truck = trucks.get(0);
                if (sum + truck <= l) {
                    bridge.add(truck);
                    sum += truck;
                    trucks.remove(0);
                } else {
                    bridge.add(EMPTY);
                }
            }
        }

        System.out.println(time);
    }

    public static void main(String[] args) throws IOException {
        new P13335___Truck().solve();
    }
}
