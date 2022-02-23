package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P03078___GoodFriends {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = br.readLine().length();
        }

        long goodFriends = 0;
        Map<Integer, Integer> friends = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i > k) {
                friends.put(a[i - k - 1], friends.get(a[i - k - 1]) - 1);
            }

            Integer friendCount = friends.getOrDefault(a[i], 0);
            goodFriends += friendCount;
            friends.put(a[i], friendCount + 1);
        }

        System.out.println(goodFriends);
    }

    public static void main(String[] args) throws IOException {
        new P03078___GoodFriends().solve();
    }
}
