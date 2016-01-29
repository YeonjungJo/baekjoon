package baekjoon.day20160117;
import java.util.Scanner;

public class p7572_sexagenaryCycle {
	
	private static final String TEN_HEAVENLY_STEM = "6789012345";
	private static final String CHINESE_ZODIAC = "IJKLABCDEFGH"; 

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println(getZodiac(year) + "" + getStem(year));
	}

	private char getStem(int year) {
		return TEN_HEAVENLY_STEM.charAt(year % 10);
	}

	private char getZodiac(int year) {
		return CHINESE_ZODIAC.charAt(year % 12);
	}

	public static void main(String[] args) {
		new p7572_sexagenaryCycle().solve();
	}
}

