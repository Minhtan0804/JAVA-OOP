package Input_Output_File.J07032;

import java.io.*;
import java.util.*;

public class SoThuanNghich {
    public static void main(String[] args) throws Exception {
        ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) inputStream1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) inputStream2.readObject();
        int[] arr1 = new int[1000000];
        int[] arr2 = new int[1000000];

        for (Integer i : list1) {
            if (codition(i))
                arr1[i]++;
        }
        for (Integer i : list2) {
            if (codition(i))
                arr2[i]++;
        }

        int count = 0;
        for (int i = 0; i < 1000000; i++) {
            if (arr1[i] > 0 && arr2[i] > 0) {
                int res = arr1[i] + arr2[i];
                System.out.println(i + " " + res);
                count++;
            }

            if (count == 10) break;
        }
    }

    public static boolean codition(Integer str) {
        String num = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(num);
        if (num.equals(stringBuilder.reverse().toString()) == false)
            return false;
        if (num.length() % 2 == 0 || num.length() == 1)
            return false;
        for (int i = 0; i < num.length(); i++) {
            if ((int)(num.charAt(i) - '0') % 2 == 0)
                return false;
        }

        return true;
    }
}
