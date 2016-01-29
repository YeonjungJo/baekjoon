package baekjoon.todo;
import java.util.Scanner;

public class T1620 {
	
	private String[] dictionary = new String[100001];
	private static final String regex = "[0-9]*";
	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0; i<n; i++){
			dictionary[i] = sc.next();
		}
		for(int i=0; i<m; i++){
			String p = sc.next();
			if(p.matches(regex)) System.out.println(dictionary[Integer.parseInt(p) -1]);
			else { 
				for(int j=0; j<n; j++){
					if(dictionary[j].equals(p)){
						System.out.println(j + 1);
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		new T1620().solve();
	}
}

