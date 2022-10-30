package Java_Collection.J08010;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();
        int max = 0;

        while (sc.hasNext()) {
            String str = sc.next();
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                if (!map.containsKey(str))
                    map.put(str, 1);
                else
                    map.put(str, map.get(str) + 1);

                max = Math.max(max, str.length());
            }
        }

        for (String str : map.keySet()){
            if (str.length() == max)
                System.out.println(str + " " + map.get(str));
        }
    }
}
