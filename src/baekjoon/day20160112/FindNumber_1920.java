package baekjoon.day20160112;
import java.util.HashMap;
import java.util.Scanner;

public class FindNumber_1920 {
	
	private HashMap<Integer, Integer> list = new HashMap<>();
	
	private void init() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			list.put(sc.nextInt(), 0);
		}
		n = sc.nextInt();
		for(int i=0; i<n; i++){
			if(list.containsKey(sc.nextInt())) System.out.println("1");
			else System.out.println("0");
		}
	}

	public static void main(String[] args) {
		new FindNumber_1920().init();
	}
}