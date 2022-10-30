package danhsachsinhvien1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(String ma, String ten, String lop, String ngaysinh, float gpa) throws Exception {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = dateFormat.parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %s %.2f", this.ma, this.ten, this.lop, dateFormat.format(this.ngaysinh), this.gpa);
    }
}
