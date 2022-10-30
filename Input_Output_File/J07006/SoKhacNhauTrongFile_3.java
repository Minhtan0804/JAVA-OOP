package Input_Output_File.J07006;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SoKhacNhauTrongFile_3 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) inputStream.readObject();
        int[] a = new int[1000];

        for (Integer i : arr)
            a[i]++;

        for (int i = 0; i < 1000; i++) {
            if (a[i] > 0)
                System.out.println(i + " " + a[i]);
        }
    }
}
