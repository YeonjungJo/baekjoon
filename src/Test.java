import java.util.Scanner;

public class Test {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		System.out.println((String.format("%08d", Long.parseLong((Integer.toString(Integer.parseInt("256"), 2))))));
	}

	public static void main(String[] args) {
		new Test().solve();
	}
}
