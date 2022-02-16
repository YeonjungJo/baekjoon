package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P17219___FindPassword {

    private void solve() {
        int n = sc.nextInt();
        int t = sc.nextInt();
        Map<String, String> dic = new HashMap<>();
        for (int i = 0; i < n; i++) {
            dic.put(sc.next(), sc.next());
        }
        for (int i = 0; i < t; i++) {
            System.out.println(dic.get(sc.next()));
        }
    }

    public static void main(String[] args) {
        sc.init();
        new P17219___FindPassword().solve();
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
