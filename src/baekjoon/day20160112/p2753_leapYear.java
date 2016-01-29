package baekjoon.day20160112;
import java.util.Scanner;

public class p2753_leapYear {

	private void init() {
		Scanner sc = new Scanner(System.in);
		operate(sc.nextInt());
	}

	private void operate(int year) {
		if((year % 4 == 0) && !(year % 100 == 0)){
			System.out.println("1");
		} else if((year % 4 == 0) && (year % 400 == 0)){
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public static void main(String[] args) {
		new p2753_leapYear().init();
	}
}