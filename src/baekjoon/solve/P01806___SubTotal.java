package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01806___SubTotal {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        String[] t = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]);
        int s = Integer.parseInt(t[1]);

        int[] a = new int[n];
        String[] tmp = br.readLine().split(" ");
        int tSum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tmp[i]);
            tSum += a[i];
        }

        if (tSum < s) {
            System.out.println(0);
            return;
        }

        int sum = a[0];
        int length = n;
        int start = 0;
        int end = 0;

        while (end <= n - 1) {
            if (sum < s) {
                if (end == n - 1) {
                    break;
                }
                if (end - start + 1 >= length - 1) {
                    start++;
                    end++;
                    sum = sum + a[end] - a[start - 1];
                } else {
                    end++;
                    sum = sum + a[end];
                }
            } else {
                length = end - start + 1;
                start++;
                sum = sum - a[start - 1];
            }
        }

        System.out.println(length);
    }

    public static void main(String[] args) throws IOException {
        new P01806___SubTotal().solve();
    }
}
