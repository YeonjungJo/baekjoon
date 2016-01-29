package baekjoon.day20160112;
import java.util.Scanner;

public class SplitNumberSum_10953 {
	
	private int testcase;
	
	public SplitNumberSum_10953(){
		scan();
	}
	
	private void scan(){
		Scanner sc = new Scanner(System.in);
		testcase = sc.nextInt();
		for(int i=0; i<testcase; i++){
			operate(sc.next());
		}
	}
	
	private void operate(String input){
		String[] numbers = input.split(",");
		int result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		new SplitNumberSum_10953();
	}
}
