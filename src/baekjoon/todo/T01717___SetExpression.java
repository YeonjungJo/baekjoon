package baekjoon.todo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class T01717___SetExpression {
 
    private static final int MERGE = 0;
    private static final int CHECK = 1;
 
    private void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = i;
        }
 
        for (int i = 0; i < m; i++) {
            switch (sc.nextInt()) {
            case MERGE:
                merge(a, n, sc.nextInt(), sc.nextInt());
                break;
            case CHECK:
                check(a, sc.nextInt(), sc.nextInt());
                break;
            }
        }
    }
 
    private void check(int[] a, int i, int j) {
        System.out.println(a[i] == a[j] ? "YES" : "NO");
    }
 
    private void merge(int[] a, int n, int i, int j) {
        if (a[i] == a[j]) return;
        for (int k = 0; k <= n; k++) {
            if (a[k] == a[j]) a[k] = a[i];
        }
    }
 
    public static void main(String[] args) {
        sc.init();
        new T01717___SetExpression().solve();
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
                } catch (IOException e) {}
            }
 
            return st.nextToken();
        }
 
        static int nextInt() {
            return Integer.parseInt(next());
        }
    }
}