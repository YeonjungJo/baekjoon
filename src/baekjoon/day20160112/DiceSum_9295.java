package baekjoon.day20160112;
import java.util.Scanner;
import java.util.Stack;

public class DiceSum_9295 {
	
	private int testcase;
	
	public DiceSum_9295(){
		scan();
	}
	
	private void scan(){
		Scanner sc = new Scanner(System.in);
		testcase = sc.nextInt();
		for(int i=1; i<=testcase; i++){
			operate(i, sc.nextInt(), sc.nextInt());
		}
	}
	
	private void operate(int n, int i, int j){
		System.out.println("Case " + n + ": " + (i+j));
	}
	
	public static void main(String[] args) {
		new DiceSum_9295();
	}
}
