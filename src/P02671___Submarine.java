import java.util.Scanner;

public class P02671___Submarine {

    private static final Scanner sc = new Scanner(System.in);

    private void solve() {
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.matches("(100+1+|01)*")) {
                System.out.println("SUBMARINE");
            } else
                System.out.println("NOISE");
        }
    }

    public static void main(String[] args) {
        new P02671___Submarine().solve();
    }
}
