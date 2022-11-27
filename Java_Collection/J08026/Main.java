package Java_Collection.J08026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(minOperations(sc.nextInt(), sc.nextInt()));
        }
    }

    public static int minOperations(int s, int t) {
        if (s == t)
            return 0;

        if (s <= 0 && t > 0)
            return -1;

        if (s > t)
            return s - t;

        if (t % 2 == 0)
            return 1 + minOperations(s, t / 2);
        else
            return 1 + minOperations(s, t + 1);
    }
}
