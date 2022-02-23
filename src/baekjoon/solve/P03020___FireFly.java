package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P03020___FireFly {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]);
        int[] a = new int[n / 2];
        int[] b = new int[n / 2];
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                a[i / 2] = h - tmp;
            } else {
                b[i / 2] = tmp;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int posB = 0;
        int posA = 0;
        int min = n;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 1; i <= h; i++) {
            posA = getPosA(a, posA, i);
            posB = getPosB(b, posB, i);

            int value = b.length - posB + posA;
            if (value <= min) {
                min = value;
                count.put(value, count.getOrDefault(value, 0) + 1);
            }
        }

        System.out.println(min + " " + count.get(min));
    }

    private int getPosB(int[] b, int pos, int target) {
        if (pos >= b.length) {
            return pos;
        }
        while (b[pos] < target) {
            pos++;
            if (pos >= b.length) {
                return pos;
            }
        }
        return pos;
    }

    private int getPosA(int[] a, int pos, int target) {
        if (pos >= a.length) {
            return pos;
        }
        while (a[pos] < target) {
            pos++;
            if (pos >= a.length) {
                return pos;
            }
        }
        return pos;
    }

    public static void main(String[] args) throws IOException {
        new P03020___FireFly().solve();
    }
}
