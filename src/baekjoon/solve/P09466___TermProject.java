package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P09466___TermProject {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private void run() throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            System.out.println(solve());
        }
    }

    private int solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int member = 0;
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(i);
            int count = 1;
            if (b[i] != 0) {
                continue;
            }
            b[i] = count;
            int next = a[i];
            while (!set.contains(next) && b[next] == 0) {
                count++;
                set.add(next);
                b[next] = count;
                next = a[next];
            }

            if (set.contains(next)) {
                member += count - b[next] + 1;
            }
        }

        return n - member;
    }

    public static void main(String[] args) throws IOException {
        new P09466___TermProject().run();
    }
}
