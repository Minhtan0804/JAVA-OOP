package Input_Output_File.J07015;

import java.util.*;
import java.io.*;

public class SoNguyenToTrongFileNhiPhan {
    public static void main(String[] agrs) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) in.readObject();
        int[] a = new int[10000];
        for (Integer i : arr) {
            if (isPrime(i))
                a[i]++;
        }
        for (int i = 0; i < 10000; i++) {
            if (a[i] > 0)
                System.out.println(i + " " + a[i]);
        }
    }

    public static boolean isPrime(Integer n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i +=2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}