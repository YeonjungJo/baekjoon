package baekjoon.day20160112;
import java.util.Scanner;

public class Sum_11720 {

	public Sum_11720() {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		String input = sc.next();
		
		int sum = 0;
		for(int i=0; i<input.length(); i++){
			sum += Character.getNumericValue(input.charAt(i));
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Sum_11720();
	}
}
