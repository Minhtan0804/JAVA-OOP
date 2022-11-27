package Array.J02009;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            Pair pair = new Pair(sc.nextInt(), sc.nextInt());
            pairs[i] = pair;
        }

        Arrays.sort(pairs);

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (pairs[i].getFirst() >= res)
                res = pairs[i].getFirst() + pairs[i].getSecond();
            else
                res += pairs[i].getSecond();
        }

        System.out.println(res);
    }
}
