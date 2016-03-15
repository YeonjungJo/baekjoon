import java.util.Scanner;

public class Test {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = "OOIOIOIOIIOII";
		int n = 3;
		s = s.replaceFirst("[IO]{" + n + "}I", "[IO]{" + (n - 1) + "}I");
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Test().solve();
	}
}
