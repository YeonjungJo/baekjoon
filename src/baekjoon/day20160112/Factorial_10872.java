package baekjoon.day20160112;
import java.util.Scanner;

public class Factorial_10872 {
	
	private int N;
	
	public Factorial_10872(){
		scan();
		operate();
	}
	
	private void scan(){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
	}
	
	private void operate(){
		System.out.println(operate(N));
	}
	
	private int operate(int i){
		if(i == 1 || i == 0) return 1;
		else return i*operate(i-1);
	}
	
	public static void main(String[] args) {
		new Factorial_10872();
	}
}
