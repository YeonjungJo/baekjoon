package baekjoon.solve;
import java.util.Scanner;

public class P02564___Guard {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int width = sc.nextInt();
		int height = sc.nextInt();

		int n = sc.nextInt();
		Location[] store = new Location[n];
		for (int i = 0; i < n; i++) {
			store[i] = new Location(sc.nextInt(), sc.nextInt());
		}
		Location myLocation = new Location(sc.nextInt(), sc.nextInt());

		int totalDistance = 0;

		for (int i = 0; i < n; i++) {
			totalDistance += getDistance(width, height, myLocation, store[i]);
		}

		System.out.println(totalDistance);
	}

	private int getDistance(int width, int height, Location myLocation, Location store) {
		if (myLocation.getDir() == store.getDir()) return Math.abs(myLocation.getDistance() - store.distance);

		switch (myLocation.getDir()) {
		case (Location.NORTH):
			switch (store.getDir()) {
			case (Location.SOUTH):
				int i = myLocation.getDistance() + store.getDistance();
				int j = 2 * width - (myLocation.getDistance() + store.getDistance());
				return height + (i > j ? j : i);
			case (Location.WEST):
				return myLocation.getDistance() + store.getDistance();
			case (Location.EAST):
				return width - myLocation.getDistance() + store.getDistance();
			}
		case (Location.SOUTH):
			switch (store.getDir()) {
			case (Location.NORTH):
				return getDistance(width, height, store, myLocation);
			case (Location.WEST):
				return myLocation.getDistance() + height - store.getDistance();
			case (Location.EAST):
				return width - myLocation.getDistance() + height - store.getDistance();
			}
		case (Location.WEST):
			switch (store.getDir()) {
			case (Location.NORTH):
			case (Location.SOUTH):
				return getDistance(width, height, store, myLocation);
			case (Location.EAST):
				int i = myLocation.getDistance() + store.getDistance();
				int j = 2 * height - (myLocation.getDistance() + store.getDistance());
				return width + (i > j ? j : i);
			}
		case (Location.EAST):
			return getDistance(width, height, store, myLocation);
		}
		return 0;
	}

	private class Location {
		public static final int NORTH = 1;
		public static final int SOUTH = 2;
		public static final int WEST = 3;
		public static final int EAST = 4;

		private final int dir;
		private final int distance;

		public Location(int dir, int distance) {
			this.dir = dir;
			this.distance = distance;
		}

		public int getDir() {
			return dir;
		}

		public int getDistance() {
			return distance;
		}
	}

	public static void main(String[] args) {
		new P02564___Guard().solve();
	}
}
