package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P18108___ThaiYear {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        System.out.println(n - 543);
    }

    public static void main(String[] args) throws IOException {
        new P18108___ThaiYear().solve();
    }
}
