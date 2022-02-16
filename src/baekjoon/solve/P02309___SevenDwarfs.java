package baekjoon.solve;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class P02309___SevenDwarfs {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        int hint = -100;

        Set<Integer> h = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            int tmp = sc.nextInt();
            hint += tmp;
            h.add(tmp);
        }

        for (Integer i : h) {
            if (h.contains(hint - i) && hint - i != i) {
                h.remove(i);
                h.remove(hint - i);
                break;
            }
        }

        System.out.println(h.stream().sorted().map(Object::toString).collect(Collectors.joining("\n")));
    }


    public static void main(String[] args) {
        new P02309___SevenDwarfs().solve();
    }
}
