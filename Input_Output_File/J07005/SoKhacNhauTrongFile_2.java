package Input_Output_File.J07005;

import java.io.*;

public class SoKhacNhauTrongFile_2 {
    public static void main(String[] args) throws Exception {
        DataInputStream inputStream = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] arr = new int[1000];

        for (int i = 0; i < 100000; i++) {
            arr[inputStream.readInt()]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (arr[i] > 0)
                System.out.println(i + " " + arr[i]);
        }
    }
}
