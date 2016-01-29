package baekjoon.day20160117;
public class p6679_surpriseNumber {

	private void solve() {
		int i = 1000;
		while(i <= 9999){
			if(confirm(i)) System.out.println(i);
			i++;
		}
	}
	
	private boolean confirm(int i) {
		int dec = decSum(i);
		if(dec == duoSum(i)){
			if(dec == hexSum(i)) return true;
		}
		return false;
	}

	private int decSum(int i) {
		int result = 0;
		while(i > 0){
			result += i % 10;
			i /= 10;
		}
		return result;
	}

	private int duoSum(int i) {
		int result = 0;
		while(i > 0){
			result += i % 12;
			i /= 12;
		}
		return result;
	}

	private int hexSum(int i) {
		int result = 0;
		while(i > 0){
			result += i % 16;
			i /= 16;
		}
		return result;
	}

	public static void main(String[] args) {
		new p6679_surpriseNumber().solve();
	}
}

