package baekjoon.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 폴라로 알고리즘을 사용해서 풀이해야한다고 한다.
// 이 알고리즘을 사용해서 풀이할 경우 1219가 잘 인수분해되는지 확인해볼것.
public class T04149___LargeNumberFactorization {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        long n = Long.parseLong(br.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                stringBuilder.append(i).append("\n");
                n /= i;
                i--;
            }
        }
        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new T04149___LargeNumberFactorization().solve();
    }
}
