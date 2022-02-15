package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P02869___SnailWannaClimb {
    private void solve() {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int target = sc.nextInt();

        int result = 1 + ((target - a) / (a - b));
        boolean tmp = (target - a) % (a - b) == 0;

        System.out.println(tmp ? result : result + 1);
    }

    public static void main(String[] args) {
        sc.init();
        new P02869___SnailWannaClimb().solve();
    }

    static class sc {
        private static BufferedReader br;
        private static StringTokenizer st;

        static void init() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        static String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }

            return st.nextToken();
        }

        static int nextInt() {
            return Integer.parseInt(next());
        }
    }
}