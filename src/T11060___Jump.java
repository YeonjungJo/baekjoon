import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class T11060___Jump {
 
    private static final int NOT_AVAILABLE = -1;
    private static final int MAX_VALUE = 1001;
    private static final int ARRIVE = 0;
 
    private void solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        int[] d = new int[n];
 
        search(d, a, n, 0, 0);
        System.out.println(d[0]);
    }
 
    private int search(int[] d, int[] a, int n, int p, int cost) {
        if (d[p] != 0 && d[p] <= cost - 1) return d[p];
        if (p == n - 1) return ARRIVE;
        int min = MAX_VALUE;
        for (int i = 1; i <= a[p] && p + i < n; i++) {
            search(d, a, n, p + i, cost + 1);
            if (d[p + i] == 0) return d[p] = 1;
            if (d[p + i] != -1 && min > d[p + i]) min = d[p + i];
        }
        if (min == MAX_VALUE) return d[p] = NOT_AVAILABLE;
        return d[p] = min + 1;
    }
    public static void main(String[] args) {
        sc.init();
        new T11060___Jump().solve();
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