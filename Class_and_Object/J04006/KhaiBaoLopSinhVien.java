package Class_and_Object.J04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SinhVien {
    private String id, fullName, className, dateBirth;
    private float GPA;

    public SinhVien() {
        this ("", "", "", 0);
    }

    public SinhVien(String fullName, String className, String dateBirth, float GPA) {
        this.fullName = fullName;
        this.className = className;
        this.dateBirth = dateBirth;
        this.GPA = GPA;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public void convertDateBirth() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            Date date = dateFormat.parse(dateBirth);
            dateBirth = dateFormat.format(date);
        } catch (ParseException e) {
            // TODO: handle exception.
        }
    }

    @Override
    public String toString() {
        return String.format("B20DCCN001 %s %s %s %.2f",
                fullName, className, dateBirth, GPA);
    }
}

public class KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien();
        sinhVien.setFullName(sc.nextLine());
        sinhVien.setClassName(sc.nextLine());
        sinhVien.setDateBirth(sc.nextLine());
        sinhVien.setGPA(sc.nextFloat());

        sinhVien.convertDateBirth();

        System.out.println(sinhVien);
    }
}
