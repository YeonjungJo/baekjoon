package baekjoon.solve;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P02941___CroatianAlphabet {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        String input = sc.nextLine();
        List<String> alphabets = new LinkedList<>();
        alphabets.add("c=");
        alphabets.add("c-");
        alphabets.add("dz=");
        alphabets.add("d-");
        alphabets.add("lj");
        alphabets.add("nj");
        alphabets.add("s=");
        alphabets.add("z=");

        for (String s : alphabets) {
            input = input.replaceAll(s, "*");
        }

        System.out.println(input.length());
    }


    public static void main(String[] args) {
        new P02941___CroatianAlphabet().solve();
    }
}
