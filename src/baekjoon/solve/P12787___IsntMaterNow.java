package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P12787___IsntMaterNow {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    private static final int OP_IPV8_TO_INTEGER = 1;
    private static final int OP_INTEGER_TO_IPV8 = 2;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int operator = Integer.parseInt(st.nextToken());
            switch (operator) {
                case OP_IPV8_TO_INTEGER:
                    toDecimal(st.nextToken());
                    break;
                case OP_INTEGER_TO_IPV8:
                    toIpv8(st.nextToken());
                    break;
            }
        }

    }

    private void toIpv8(String value) {
        BigInteger bigInteger = new BigInteger(value);
        StringBuilder stringBuilder = new StringBuilder();
        String s = String.format("%1$64s", bigInteger.toString(2)).replaceAll(" ", "0");
        for (int i = 0; i < 8; i++) {
            String substring = s.substring(8 * i, 8 * (i + 1));
            stringBuilder.append(Integer.toString(Integer.parseInt(substring, 2)));
            if (i != 7) {
                stringBuilder.append(".");
            }
        }
        System.out.println(stringBuilder);
    }

    private void toDecimal(String value) {
        String binary = Arrays.stream(value.split("\\."))
                .map(Integer::parseInt)
                .map(Integer::toBinaryString)
                .map(it -> String.format("%1$8s", it))
                .map(it -> it.replaceAll(" ", "0"))
                .collect(Collectors.joining());
        System.out.println(new BigInteger(binary, 2));
    }

    public static void main(String[] args) throws IOException {
        new P12787___IsntMaterNow().solve();
    }
}
