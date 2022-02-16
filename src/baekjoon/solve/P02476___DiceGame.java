package baekjoon.solve;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02476___DiceGame {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int n = Integer.parseInt(sc.nextLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> countBy = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .sorted()
                    .collect(Collectors.toMap(
                            it -> it,
                            it -> 1,
                            Integer::sum
                    ));

            int point;
            if (countBy.size() == 1) {
                Integer target = countBy.entrySet()
                        .stream()
                        .findFirst()
                        .map(Map.Entry::getKey)
                        .orElse(0);
                point = 10000 + 1000 * target;
            } else if (countBy.size() == 2) {
                Integer target = countBy.entrySet()
                        .stream()
                        .filter(it -> it.getValue() == 2)
                        .findFirst()
                        .map(Map.Entry::getKey)
                        .orElse(0);
                point = 1000 + 100 * target;
            } else {
                Integer target = countBy.entrySet()
                        .stream()
                        .max(Map.Entry.comparingByKey())
                        .map(Map.Entry::getKey)
                        .orElse(0);
                point = 100 * target;
            }

            max = Math.max(point, max);
        }

        System.out.println(max);
    }


    public static void main(String[] args) {
        new P02476___DiceGame().solve();
    }
}
