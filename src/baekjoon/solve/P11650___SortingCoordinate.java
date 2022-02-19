package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P11650___SortingCoordinate {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, LinkedList<Integer>> p = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (!p.containsKey(x)) {
                p.put(x, new LinkedList<>());
            }
            p.get(x).add(y);
        }

        Integer[] xArr = p.keySet().toArray(new Integer[0]);
        Arrays.sort(xArr);
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer value : xArr) {
            Integer[] yArr = p.get(value).toArray(new Integer[0]);
            Arrays.sort(yArr);
            for (Integer integer : yArr) {
                stringBuilder.append(value).append(" ").append(integer).append("\n");
            }
        }
        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P11650___SortingCoordinate().solve();
    }
}
