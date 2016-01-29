package baekjoon.day20160127;
import java.util.Scanner;

public class P2476___Dice {

	private void solve() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			int[] game = new int[3];
			int prize = 0;
			for(int j=0; j<3; j++){
				game[j] = sc.nextInt();
			}
			if(game[0] == game[1]){
				if(game[0] == game[2]) prize = 10000 + game[0] * 1000;
				else prize = 1000 + game[0] * 100;
			} else {
				if(game[0] == game[2]) prize = 1000 + game[0] * 100;
				else {
					prize = 100 * (game[0] > game[1] ? game[2] > game[0] ? game[2] : game[0] : game[1] > game[0] ? game[1] : game[0]);
				}
			}
			max = max > prize ? max : prize ; 
		}
		
		System.out.println(max);
	}

	public static void main(String[] args) {
		new P2476___Dice().solve();
	}
}
