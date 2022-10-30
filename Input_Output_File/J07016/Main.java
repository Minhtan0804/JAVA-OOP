package Input_Output_File.J07016;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) inputStream1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) inputStream2.readObject();

        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];

        for (Integer i : list1) {
            if (isPrime(i))
                arr1[i]++;
        }

        for (Integer i : list2) {
            if (isPrime(i))
                arr2[i]++;
        }

        for (int i = 0; i < 10000; i++) {
            if (arr1[i] > 0 && arr2[i] > 0)
                System.out.println(i + " " + arr1[i] + " " + arr2[i]);
        }
    }

    public static boolean isPrime(Integer n) {
        if (n < 2 ) return false;
        if (n == 2) return true;

        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
