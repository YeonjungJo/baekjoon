package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P14713___Parrot {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        List<List<String>> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> tmp = Arrays.stream(br.readLine().split(" "))
                    .collect(Collectors.toList());
            sum += tmp.size();
            words.add(tmp);
        }

        List<String> target = Arrays.stream(br.readLine().split(" "))
                .collect(Collectors.toList());

        if (target.size() != sum) {
            System.out.println("Impossible");
            return;
        }

        for (String s : target) {
            boolean validate = validate(words, s);
            if (!validate) {
                System.out.println("Impossible");
                return;
            }
        }

        System.out.println("Possible");
    }

    private boolean validate(List<List<String>> words, String s) {
        for (List<String> w : words) {
            if (!w.isEmpty() && s.equals(w.get(0))) {
                w.remove(0);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        new P14713___Parrot().solve();
    }
}
