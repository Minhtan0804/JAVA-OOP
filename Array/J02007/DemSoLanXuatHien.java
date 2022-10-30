package Array.J02007;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] temp = new int[100000];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                temp[a[i]]++;
            }

            System.out.println("Test " + test++ + ":");

            for (int i = 0; i < n; i++) {
                if (temp[a[i]] > 0) {
                    System.out.println(a[i] + " xuat hien " + temp[a[i]] + " lan");
                    temp[a[i]] = 0;
                }
            }
        }
    }
}
