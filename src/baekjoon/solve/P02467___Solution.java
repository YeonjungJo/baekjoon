package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P02467___Solution {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int resultLeft;
        int resultRight;

        if (Math.abs(a[0] + a[1]) < Math.abs(a[n - 1] + a[n - 2])) {
            resultLeft = 0;
            resultRight = 1;
        } else {
            resultLeft = n - 2;
            resultRight = n - 1;
        }
        int min = a[resultLeft] + a[resultRight];

        int left = 0;
        int right = n - 1;
        while (true) {
            if (left == right) {
                break;
            }
            int mix = a[left] + a[right];
            if (Math.abs(min) > Math.abs(mix)) {
                min = mix;
                resultLeft = left;
                resultRight = right;
            }
            if (mix == 0) {
                break;
            }
            if (mix > 0) {
                right--;
            }
            if (mix < 0) {
                left++;
            }
        }

        System.out.println(a[resultLeft] + " " + a[resultRight]);
    }

    public static void main(String[] args) throws IOException {
        new P02467___Solution().solve();
    }
}
