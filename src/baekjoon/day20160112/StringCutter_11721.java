package baekjoon.day20160112;
import java.util.Scanner;

public class StringCutter_11721 {

	public StringCutter_11721(){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		while(input.length() >= 10){
			System.out.println(input.substring(0, 10));
			input = input.substring(10);
		}
		System.out.println(input);
	}
	
	public static void main(String[] args) {
		new StringCutter_11721();
	}
}
