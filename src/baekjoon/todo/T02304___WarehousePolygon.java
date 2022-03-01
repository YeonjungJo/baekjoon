package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class T02304___WarehousePolygon {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            m.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        List<Integer> keys = m.keySet().stream().sorted().collect(Collectors.toList());

        int a = 0;
        int maxIndex = keys.get(0);
        int max = m.get(maxIndex);
        for (Integer i : keys) {
            Integer current = m.get(i);
            if (current > max) {
                a += (i - maxIndex) * max;
                maxIndex = i;
                max = current;
            }
        }

        a += (keys.get(keys.size() - 1) - maxIndex + 1) * max;

        int beforeIndex = keys.get(keys.size() - 1);
        int beforeMax = m.get(beforeIndex);
        for (int i = keys.size() - 1; i >= 0; i--) {
            Integer index = keys.get(i);
            Integer current = m.get(index);
            if (current == max) {
                a -= (beforeIndex - index) * (current - beforeMax);
                break;
            }
            if (current > max) {
                a -= (beforeIndex - index) * (beforeMax - current);
                beforeIndex = index;
                beforeMax = current;
            }
        }

        System.out.println(a);
    }

    public static void main(String[] args) throws IOException {
        new T02304___WarehousePolygon().solve();
    }
}