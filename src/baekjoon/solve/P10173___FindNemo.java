package baekjoon.solve;

import java.util.Scanner;

public class P10173___FindNemo {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        while (true) {
            String s = sc.nextLine();
            if (s.equals("EOI")) {
                return;
            }
            System.out.println(s.toLowerCase().contains("nemo") ? "Found" : "Missing");
        }
    }


    public static void main(String[] args) {
        new P10173___FindNemo().solve();
    }
}
