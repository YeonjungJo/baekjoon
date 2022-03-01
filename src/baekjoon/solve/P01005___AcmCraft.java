import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P01005___AcmCraft {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public static final int NOT_VISIT = -1;

    private void run() throws IOException {
        int testcase = Integer.parseInt(br.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        for (int t = 0; t < testcase; t++) {
            stringBuilder.append(solve()).append("\n");
        }
        System.out.print(stringBuilder);
    }

    private long solve() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] buildTime = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            buildTime[i] = Integer.parseInt(st.nextToken());
        }

        boolean[][] order = new boolean[n][n];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            order[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = true;
        }
        int goal = Integer.parseInt(br.readLine()) - 1;

        long[] d = new long[n];
        Arrays.fill(d, NOT_VISIT);
        return search(order, buildTime, d, goal);
    }

    private long search(boolean[][] order, long[] buildTime, long[] d, int goal) {
        if (d[goal] != NOT_VISIT) return d[goal];
        long max = 0;
        for (int i = 0; i < d.length; i++) {
            if (order[i][goal]) {
                long tmp = search(order, buildTime, d, i);
                max = Math.max(tmp, max);
            }
        }
        return d[goal] = buildTime[goal] + max;
    }

    public static void main(String[] args) throws IOException {
        new P01005___AcmCraft().run();
    }
}
