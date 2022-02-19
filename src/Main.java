import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            solve(Integer.parseInt(br.readLine()));
        }
    }

    private void solve(int target) {
        for (int i = 0; i <= target / 2; i++) {

        }
    }

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}
