package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class P17413___ReverseWord2 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void run() throws IOException {
        char[] chars = br.readLine().toCharArray();

        StringBuilder tmp = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c == '<') {
                String reversed = Arrays.stream(tmp.toString()
                                .split(" "))
                        .map(StringBuilder::new)
                        .map(StringBuilder::reverse)
                        .collect(Collectors.joining(" "));
                result.append(reversed);
                tmp = new StringBuilder();
                result.append("<");
            } else if (c == '>') {
                result.append(tmp).append('>');
                tmp = new StringBuilder();
            } else {
                tmp.append(c);
            }
        }

        if (tmp.length() != 0) {
            String reversed = Arrays.stream(tmp.toString()
                            .split(" "))
                    .map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .collect(Collectors.joining(" "));
            result.append(reversed);
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        new P17413___ReverseWord2().run();
    }
}
