package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P11652___Card {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<Long> inputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputs.add(Long.parseLong(br.readLine()));
        }

        Map<Long, Long> counts = inputs.stream()
                .sorted()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Long maxValue = counts.values().stream()
                .max(Comparator.naturalOrder())
                .orElse(Long.MIN_VALUE);

        Long x = counts.entrySet()
                .stream()
                .filter(it -> it.getValue().equals(maxValue))
                .map(Entry::getKey)
                .sorted()
                .findFirst()
                .orElse(0L);

        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new P11652___Card().solve();
    }
}
