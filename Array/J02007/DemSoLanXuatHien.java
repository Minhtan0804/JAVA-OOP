package Array.J02007;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while (t-- > 0) {
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (map.containsKey(num))
                    map.put(num, map.get(num) + 1);
                else
                    map.put(num, 1);
            }

            System.out.println("Test " + test++ + ":");

            for (Map.Entry<Integer, Integer> entry : map.entrySet())
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
        }
    }
}
