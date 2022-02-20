package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T03165___Five {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        char[] tmp = String.valueOf(n + 1).toCharArray();

        int count = 0;
        for (char c : tmp) {
            if (c == '5') {
                count++;
            }
        }

        int[] s = new int[16];
        for (int i = 0; i < tmp.length; i++) {
            s[i] = tmp[tmp.length - i - 1] - '0';
        }

        int countAfter = 0;
        boolean carry = false;
        for (int i = 0; i < s.length; i++) {
            if (carry) {
                if (s[i] == 9) {
                    s[i] = 0;
                    if (countAfter >= k) {
                        continue;
                    }
                } else {
                    carry = false;
                    if (s[i] == 5) {
                        count--;
                    } else if (s[i] == 4) {
                        count++;
                        countAfter++;
                    }
                    s[i]++;
                    if (k <= count) {
                        break;
                    }
                }
            } else {
                if (k <= count) {
                    break;
                }
            }
            if (s[i] == 5) {
                continue;
            }
            if (s[i] >= 5) {
                carry = true;
            }
            count++;
            countAfter++;
            s[i] = 5;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int c : s) {
            stringBuilder.insert(0, c);
        }
        System.out.println(Long.parseLong(stringBuilder.toString()));
    }

    public static void main(String[] args) throws IOException {
        new T03165___Five().solve();
    }
}