package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P10859___ReversedPrimeNumber {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        Map<String, String> reversed = new HashMap<>();
        reversed.put("0", "0");
        reversed.put("1", "1");
        reversed.put("2", "2");
        reversed.put("5", "5");
        reversed.put("6", "9");
        reversed.put("8", "8");
        reversed.put("9", "6");

        String s = br.readLine();
        long original = Long.parseLong(s);
        if (!isPrimeNumber(original)) {
            System.out.println("no");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String tmp = s.substring(s.length() - i - 1, s.length() - i);
            String reversedNumber = reversed.get(tmp);
            if (reversedNumber == null) {
                System.out.println("no");
                return;
            }
            stringBuilder.append(reversedNumber);
        }

        long l = Long.parseLong(stringBuilder.toString());
        if (!isPrimeNumber(l)) {
            System.out.println("no");
            return;
        }
        System.out.println("yes");
    }

    private boolean isPrimeNumber(long l) {
        if (l == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(l); i++) {
            if (l % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        new P10859___ReversedPrimeNumber().solve();
    }
}
