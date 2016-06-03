import java.util.Scanner;

public class P12791___Starman {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		Album[] album = new Album[25];
		album[0] = new Album(1967, "DavidBowie");
		album[1] = new Album(1969, "SpaceOddity");
		album[2] = new Album(1970, "TheManWhoSoldTheWorld");
		album[3] = new Album(1971, "HunkyDory");
		album[4] = new Album(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
		album[5] = new Album(1973, "AladdinSane");
		album[6] = new Album(1973, "PinUps");
		album[7] = new Album(1974, "DiamondDogs");
		album[8] = new Album(1975, "YoungAmericans");
		album[9] = new Album(1976, "StationToStation");
		album[10] = new Album(1977, "Low");
		album[11] = new Album(1977, "Heroes");
		album[12] = new Album(1979, "Lodger");
		album[13] = new Album(1980, "ScaryMonstersAndSuperCreeps");
		album[14] = new Album(1983, "LetsDance");
		album[15] = new Album(1984, "Tonight");
		album[16] = new Album(1987, "NeverLetMeDown");
		album[17] = new Album(1993, "BlackTieWhiteNoise");
		album[18] = new Album(1995, "1.Outside");
		album[19] = new Album(1997, "Earthling");
		album[20] = new Album(1999, "Hours");
		album[21] = new Album(2002, "Heathen");
		album[22] = new Album(2003, "Reality");
		album[23] = new Album(2013, "TheNextDay");
		album[24] = new Album(2016, "BlackStar");

		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			search(album, start, end);
		}
	}

	private void search(Album[] album, int start, int end) {
		int count = 0;
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < album.length; i++) {
			if (album[i].getYear() >= start) {
				if (album[i].getYear() > end) break;
				else {
					strBuilder.append(album[i].toString());
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.print(strBuilder.toString());
	}

	private class Album {
		private int year;
		private String name;

		public Album(int year, String name) {
			this.year = year;
			this.name = name;
		}

		public int getYear() {
			return year;
		}

		@Override
		public String toString() {
			return String.format("%d %s\n", year, name);
		}
	}

	public static void main(String[] args) {
		new P12791___Starman().solve();
	}
}
