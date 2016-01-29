package baekjoon.day20160112;
import java.util.Scanner;

public class Palindrome_10988 {

	public Palindrome_10988(){
		scan();
	}
	
	private void scan(){
		Scanner sc = new Scanner(System.in);
		operate(sc.nextLine());
	}
	
	private void operate(String input){
		while(input.length() >= 0){
			if(input.length() <= 1){
				print("1");
				return;
			} else if(input.charAt(0) == input.charAt(input.length() -1)){
				input = input.substring(1, input.length() - 1);
			} else {
				print("0");
				return;
			}
		}
	}
	
	private void print(String result) {
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		new Palindrome_10988();
	}
}
