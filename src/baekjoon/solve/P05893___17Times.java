package baekjoon.solve;
import java.util.Scanner;

public class P05893___17Times {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = sc.nextLine();
		String b = a + "0000";
		String c = "0000" + a;

		if(a.equals("0")) {
			System.out.println("0");
			return;
		}
		
		StringBuilder s = new StringBuilder();
		int carry = 0;
		for (int k = b.length() - 1; k >= 0; k--) {
			int i = Character.getNumericValue(c.charAt(k));
			int j = Character.getNumericValue(b.charAt(k));
				
			int sum = i + j + carry;
			if (sum > 1) {
				carry = 1;
				sum -= 2;
			} else {
				carry = 0;
			}
			s.insert(0, sum);
		}
		s.insert(0, carry);
		
		System.out.println(s.toString().replaceAll("^[0]+1", "1"));
	}

	public static void main(String[] args) {
		new P05893___17Times().solve();
	}
}
