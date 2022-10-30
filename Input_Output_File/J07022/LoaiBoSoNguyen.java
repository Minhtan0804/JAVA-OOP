package Input_Output_File.J07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\DATA.in"));

        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNext()) {
            String str = sc.next();
            try {
                int num = Integer.parseInt(str);
            } catch (Exception e) {
                arr.add(str);
            }
        }

        Collections.sort(arr);
//        Collections.sort(arr, Collections.reverseOrder());

        for (String i : arr)
            System.out.print(i + " ");
    }

}