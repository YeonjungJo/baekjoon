package baekjoon.day20160112;
import java.util.Scanner;

public class p1152_wordcount {

	private void init() {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().toLowerCase().split(" ");
		
		int count = 0;
		
		for (int i = 0; i < input.length; i++) {
			if (!input[i].trim().equals("")) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new p1152_wordcount().init();
	}
}