package Array.J020356;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(greedyChoose(n, s));
    }

    public static String greedyChoose(int n, int s) {
        if (s == 0 && n == 1)
            return "0 0";

        if (s == 0 || s > 9 * n)
            return "-1 -1";

        int[] a = new int[n+1];
        int i = n;
        a[1] = 1; s--;

        while (s >= 9) {
            a[i--] = 9;
            s -= 9;
        }
        a[i] += s;

        String smallestNum = Arrays.toString(a).replaceAll("\\[|\\]|,|\\s", "").substring(1);


        for (int j = n; j > 1; j--) {
            if (a[j] != 9) {
                a[j]++;
                a[1] = 0;
                break;
            }
        }

        String num = Arrays.toString(a).replaceAll("\\[|\\]|,|\\s", "").substring(1);
        StringBuilder largestNum = new StringBuilder(num);

        return smallestNum + " " + largestNum.reverse();
    }
}
