package Input_Output_File.J07029;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) inputStream.readObject();

        int[] a = new int[1000000];
        for (Integer i : arr) {
            if (isPrime(i))
                a[i]++;
        }

        int count = 0;
        for (int i = 999999 ; i >= 2; i--) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
                count++;

                if (count == 10)
                    break;
            }
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
