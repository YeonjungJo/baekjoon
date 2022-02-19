package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class P12865___OrdinaryBackpack {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> items = new HashMap<>();
        items.put(w[0], v[0]);
        Map<Integer, Integer> updated = new HashMap<>();
        for (int i = 1; i < n; i++) {
            Set<Integer> keys = items.keySet();
            for (Integer key : keys) {
                int tmp = key + w[i];
                if (tmp > k) {
                    continue;
                }

                int value = items.get(key) + v[i];
                int updatedValue = items.getOrDefault(tmp, v[i]);
                updated.put(tmp, Math.max(updatedValue, value));
            }
            items.put(w[i], v[i]);
            items.putAll(updated);
        }

        System.out.println(
                items.entrySet()
                        .stream()
                        .filter(it -> it.getKey() <= k)
                        .map(Entry::getValue)
                        .max(Comparator.naturalOrder())
                        .orElse(0));
    }

    public static void main(String[] args) throws IOException {
        new P12865___OrdinaryBackpack().solve();
    }
}
