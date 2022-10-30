package Input_Output_File.J07011;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07011\\VANBAN.in"));
//        Scanner sc = new Scanner(new File("VANBAN.in"));

        int n = Integer.parseInt(sc.nextLine());
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        while (sc.hasNext()){

            String[] str = sc.next().replaceAll("\\p{Punct}", " ").trim().toLowerCase().split("\\s+");

            for (String s : str) {
                if (treeMap.containsKey(s))
                    treeMap.put(s, treeMap.get(s) + 1);
                else
                    treeMap.put(s, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : treeMap.entrySet())
            list.add(entry.getValue());

        Collections.sort(list);
        Collections.reverse(list);

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        for (int val : list) {
            for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
                if (entry.getValue().equals(val)) {
                    result.put(entry.getKey(), val);
                }
            }
        }


        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

    }
}
