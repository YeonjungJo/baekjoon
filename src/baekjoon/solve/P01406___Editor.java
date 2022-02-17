package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P01406___Editor {

    enum Operator {
        L, D, B, P
    }

    static List<Character> left = new LinkedList<>();
    static List<Character> right = new LinkedList<>();

    private void solve() {
        left.addAll(sc.next().chars().mapToObj(c -> (char) c).collect(Collectors.toList()));

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            operate(Operator.valueOf(sc.next()));
        }

        StringBuilder result = new StringBuilder();
        for (Character c : left) {
            result.append(c);
        }
        for (Character c : right) {
            result.append(c);
        }
        System.out.println(result);
    }

    private void operate(Operator operator) {
        switch (operator) {
            case B:
                if (!left.isEmpty()) {
                    left.remove(left.size() - 1);
                }
                break;
            case D:
                if (!right.isEmpty()) {
                    left.add(right.remove(0));
                }
                break;
            case L:
                if (!left.isEmpty()) {
                    right.add(0, left.remove(left.size() - 1));
                }
                break;
            case P:
                left.add(sc.next().charAt(0));
                break;
        }
    }

    public static void main(String[] args) {
        sc.init();
        new P01406___Editor().solve();
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
