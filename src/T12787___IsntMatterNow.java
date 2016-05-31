import java.math.BigInteger;
import java.util.Scanner;

public class T12787___IsntMatterNow {

	private static final Scanner sc = new Scanner(System.in);

	private static final int OP_IPV8_TO_INTEGER = 1;
	private static final int OP_INTEGER_TO_IPV8 = 2;

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int m = sc.nextInt();
			switch (m) {
			case OP_IPV8_TO_INTEGER:
				toInteger(sc.next());
				break;
			case OP_INTEGER_TO_IPV8:
				toIpv8(sc.next());
				break;
			}
		}
	}

	private void toInteger(String s) {
		String[] tmp = s.split("[.]");

		StringBuilder bin = new StringBuilder();
		for (int i = 0; i < tmp.length; i++) {
			bin.append(String.format("%08d", Integer.parseInt(Integer.toString(Integer.parseInt(tmp[i]), 2))));
		}

		BigInteger decimal = BigInteger.ZERO;
		for (int i = 0; i < bin.length(); i++) {
			if (bin.charAt(i) == '1') {
				decimal = decimal.add(BigInteger.valueOf(2).pow(bin.length() - 1 - i));
			}
		}
		System.out.println(decimal);
	}

	private void toIpv8(String s) {
		String bin = Long.toString(Long.parseLong(s), 2);
		StringBuilder ipv8 = new StringBuilder();
		for (int i = 7; i >= 0; i--) {
			int tmp = 0;
			for (int j = 0; j < 8; j++) {
				int idx = bin.length() - 8 * (7 - i) - j - 1;
				if (idx >= 0 && bin.charAt(idx) == '1') tmp += Math.pow(2, j);
			}
			ipv8.insert(0, tmp);
			if (i != 0) ipv8.insert(0, ".");
		}
		System.out.println(ipv8.toString());
	}

	public static void main(String[] args) {
		new T12787___IsntMatterNow().solve();
	}
}
