import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        partition(0, 0, n, '0');
    }

    private void partition(int x, int y, int n, char target) {
        
    }

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }
}
