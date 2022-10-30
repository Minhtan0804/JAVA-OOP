package danhsachsinhvien1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> sinhVienArrayList = (ArrayList<SinhVien>) input.readObject();

        for (SinhVien sinhVien : sinhVienArrayList)
            System.out.println(sinhVien);
    }
}
