package Java_Collection.J08015;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            System.out.println(countPair(arr, k));
        }
    }

    public static long countPair(long[] arr, long k) {
        long count = 0;
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], (long)1);
            else
                map.put(arr[i], map.get(arr[i]) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(k - arr[i]) != null)
                count += map.get(k - arr[i]);
            if (k - arr[i] == arr[i])
                count--;
        }

        return count / 2;
    }
}
