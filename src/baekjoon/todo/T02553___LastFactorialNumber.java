package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T02553___LastFactorialNumber {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /*
    입력 : 9375
    출력 : 8


    입력 : 15625
    출력 : 4
     */

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        for (int i = 2; i <= n; i++) {
            String tmp = Integer.toString(result * i).replaceAll("[0]+$", "");
            result = Integer.parseInt(tmp.length() >= 5 ? tmp.substring(tmp.length() - 2) : tmp);
            System.out.println(i + ", " + result);
        }
        System.out.println(result % 10);
    }

    public static void main(String[] args) throws IOException {
        new T02553___LastFactorialNumber().solve();
    }
}
