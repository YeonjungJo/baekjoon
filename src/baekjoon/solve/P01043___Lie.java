package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P01043___Lie {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        Set<Integer> known = new HashSet<>();
        for (int i = 0; i < k; i++) {
            known.add(Integer.parseInt(st.nextToken()));
        }

        List<Set<Integer>> party = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            boolean valid = true;
            Set<Integer> set = new HashSet<>();

            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            for (int j = 0; j < tmp; j++) {
                int p = Integer.parseInt(st.nextToken());
                if (known.contains(p)) {
                    valid = false;
                }
                set.add(p);
            }

            if (valid) {
                party.add(set);
            } else {
                known.addAll(set);
            }
        }

        boolean isFinish = false;
        while (!isFinish) {
            isFinish = process(known, party);
        }

        System.out.println((int) party.stream().filter(it -> !it.isEmpty()).count());
    }

    private boolean process(Set<Integer> known, List<Set<Integer>> party) {
        boolean isFinish = true;
        for (int i = 0; i < party.size(); i++) {
            Set<Integer> set = party.get(i);
            if (!Collections.disjoint(known, set)) {
                known.addAll(set);
                party.set(i, Set.of());
                isFinish = false;
            }
        }
        return isFinish;
    }

    public static void main(String[] args) throws IOException {
        new P01043___Lie().solve();
    }
}
