package Input_Output_File.J07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SoKhacNhauTrongFile_1 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07004\\DATA.in"));
        Scanner sc = new Scanner(new File("DATA.in"));

        Map<Integer, Integer> numMap = new HashMap<>();
        while (sc.hasNext()) {
            int key = Integer.parseInt(sc.next());
            numMap.put(key, numMap.containsKey(key) ? numMap.get(key) + 1 : 1);
        }

        Set<Integer> set = numMap.keySet();

        for (Object key : set)
            System.out.println(key + " " + numMap.get(key));

    }
}
