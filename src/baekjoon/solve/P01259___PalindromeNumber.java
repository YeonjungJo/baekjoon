package baekjoon.solve;

import java.util.Scanner;

public class P01259___PalindromeNumber {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("0")) {
                return;
            }
            isPalindrome(input.toCharArray());
        }
    }

    private void isPalindrome(char[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - i - 1]) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }

    public static void main(String[] args) {
        new P01259___PalindromeNumber().solve();
    }
}
