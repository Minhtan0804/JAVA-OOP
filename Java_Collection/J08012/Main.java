package Java_Collection.J08012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> x = new ArrayList<Integer>();
            res.add(x);
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            res.get(a - 1).add(b - 1);
            res.get(b - 1).add(a - 1);
        }
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (res.get(i).size() == n - 1) {
                cnt1++;
            } else if (res.get(i).size() == 1) {
                cnt2++;
            }
        }
        if (cnt1 == 1 && cnt2 == n - 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
