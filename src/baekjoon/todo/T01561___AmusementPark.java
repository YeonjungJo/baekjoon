package baekjoon.todo;
import java.util.Arrays;
import java.util.Scanner;
 
public class T01561___AmusementPark {
 
    private static final Scanner sc = new Scanner(System.in);
 
    private void solve() {
        long n = sc.nextInt();
        int m = sc.nextInt();
 
        Ride[] ride = new Ride[m];
        for (int i = 0; i < m; i++) {
            ride[i] = new Ride(i + 1, sc.nextInt());
        }
        Arrays.sort(ride);
 
        binarySearch(ride, n, 0, n);
    }
 
    private void binarySearch(Ride[] ride, long n, long start, long end) {
        if (start > end) return;
        long k = (start + end) / 2 - 1;
        long sum = 0;
        boolean[] check = new boolean[ride.length];
        long tmp = 0;
        for (int i = 0; i < ride.length; i++) {
            sum += k / ride[i].getServiceTime() + 1;
            if (k % ride[i].getServiceTime() == 0) {
                tmp++;
                check[i] = true;
            }
        }
        if (n <= sum && n >= sum - tmp) {
            long p = n - (sum - tmp);
            for (int i = 0; i < check.length; i++) {
                if (check[i]) {
                    p--;
                    if (p == 0) {
                        System.out.println(ride[i].getId());
                        return;
                    }
                }
            }
        } else if (n > sum) {
            binarySearch(ride, n, k + 2, end);
        } else {
            binarySearch(ride, n, start, k);
        }
    }
 
    private class Ride implements Comparable<Ride> {
        private final long id;
        private final long serviceTime;
 
        public Ride(long id, long time) {
            this.id = id;
            this.serviceTime = time;
        }
 
        public long getId() {
            return id;
        }
 
        public long getServiceTime() {
            return serviceTime;
        }
 
        @Override
        public int compareTo(Ride o) {
            if (this.serviceTime < o.getServiceTime()) return -1;
            if (this.serviceTime > o.getServiceTime()) return 1;
            if (this.id < o.getId()) return -1;
            if (this.id > o.getId()) return 1;
            return 0;
        }
 
    }
 
    public static void main(String[] args) {
        new T01561___AmusementPark().solve();
    }
}