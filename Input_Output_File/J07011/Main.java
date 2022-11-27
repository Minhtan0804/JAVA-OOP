package Input_Output_File.J07011;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07011\\VANBAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));

        int n = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();
        Set<String> set = new TreeSet<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        while (n-- > 0){
            String[] str = sc.nextLine().trim().toLowerCase().split("\\W\\s*");

            for (String s : str) {
                if (treeMap.containsKey(s)) {
                    treeMap.put(s, treeMap.get(s) + 1);
                }
                else {
                    treeMap.put(s, 1);
                    set.add(s);
                }
            }
//            System.out.println(Arrays.toString(str));
        }

        for (String i : set) {
            if (!list.contains(treeMap.get(i)))
                list.add(treeMap.get(i));
        }

        list.sort(Collections.reverseOrder());

        for (int val : list) {
            for (String key : treeMap.keySet())
                if (treeMap.get(key) == val)
                    System.out.println(key + " " + val);
        }
    }
}
