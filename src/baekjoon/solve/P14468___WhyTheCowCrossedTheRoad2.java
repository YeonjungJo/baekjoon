package baekjoon.solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P14468___WhyTheCowCrossedTheRoad2 {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        String s = sc.nextLine();
        Map<Character, Integer[]> d = new HashMap<>();
        for (char cow = 'A'; cow <= 'Z'; cow++) {
            int start = s.indexOf(cow) + 1;
            int end = s.lastIndexOf(cow) + 1;
            Integer[] p = {start, end};
            d.put(cow, p);
        }

        int count = 0;
        for (char cow1 = 'A'; cow1 <= 'Z'; cow1++) {
            Integer[] cow1points = d.get(cow1);
            for (char cow2 = (char) (cow1 + 1); cow2 <= 'Z'; cow2++) {
                Integer[] cow2points = d.get(cow2);
                if ((cow1points[0] - cow2points[0]) * (cow1points[1] - cow2points[1]) > 0) {
                    if (cow1points[0] > cow2points[0]) {
                        if (cow1points[0] < cow2points[1]) {
                            count++;
                        }
                    } else {
                        if (cow2points[0] < cow1points[1]) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }


    public static void main(String[] args) {
        new P14468___WhyTheCowCrossedTheRoad2().solve();
    }
}
