package baekjoon.solve;

import java.util.*;
import java.util.stream.Collectors;

public class P18870___CoordinateCompression {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = sc.nextInt();

        int[] a = new int[n];
        Set<Integer> points = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            a[i] = input;
            points.add(input);
        }
        Integer[] b = points.toArray(new Integer[0]);
        Arrays.sort(b);
        Map<Integer, Integer> order = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            order.put(b[i], i);
        }

        System.out.println(Arrays.stream(a)
                .map(order::get)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

    public static void main(String[] args) {
        new P18870___CoordinateCompression().solve();
    }
}
