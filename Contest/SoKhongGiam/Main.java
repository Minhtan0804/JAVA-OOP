package Contest.SoKhongGiam;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) inputStream1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) inputStream2.readObject();

        int[] arr1 = new int[1000000];
        int[] arr2 = new int[1000000];

        for (Integer i : list1) {
            if (notDecrease(i))
                arr1[i]++;
        }
        for (Integer i : list2) {
            if (notDecrease(i))
                arr2[i]++;
        }

        for (int i = 0; i < 1000000; i++) {
            if (arr1[i] > 0 && arr2[i] > 0)
                System.out.println(i + " " + arr1[i] + " " + arr2[i]);
        }

    }

    public static boolean notDecrease(Integer n) {
        String num = String.valueOf(n);
        if (num.length() < 2) return false;

        for (int i = 0; i < num.length()-1; i++) {
            if (num.charAt(i) > num.charAt(i+1))
                return false;
        }

        return true;
    }
}
