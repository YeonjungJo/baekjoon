package baekjoon.solve;
import java.util.Scanner;

public class P05026___DoctorsCourse {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (s.equals("P=NP")) System.out.println("skipped");
			else {
				String[] a = s.split("[+]");
				System.out.println(Integer.parseInt(a[0]) + Integer.parseInt(a[1]));
			}
		}
	}

	public static void main(String[] args) {
		new P05026___DoctorsCourse().solve();
	}
}
