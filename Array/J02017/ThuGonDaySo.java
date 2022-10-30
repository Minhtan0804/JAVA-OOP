package Array.J02017;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      List<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++)
            array.add(sc.nextInt());

        boolean check = true;

        while (check) {
            check = false;
            for (int i = 0; i < array.size() - 1; i++) {
                if ((array.get(i) + array.get(i+1)) % 2 == 0) {
                    array.remove(i);
                    array.remove(i);
                    check = true;
                }
            }
        }

        System.out.println(array.size());
    }
}
