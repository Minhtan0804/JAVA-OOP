package Class_and_Object.J04007;

import java.util.Scanner;

class NhanVien {
    private String fullName, gender, dateOfBirth,
            address, taxNumber, contractDate;

    public NhanVien() {

    }

    public NhanVien(String fullName, String gender,
                    String dateOfBirth, String address,
                    String taxNumber, String contractDate) {
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.taxNumber = taxNumber;
        this.contractDate = contractDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return String.format("00001 %s %s %s %s %s %s", fullName,
                dateOfBirth, gender, address, taxNumber, contractDate);
    }
}

public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien();

        nhanVien.setFullName(sc.nextLine());
        nhanVien.setGender(sc.nextLine());
        nhanVien.setDateOfBirth(sc.nextLine());
        nhanVien.setAddress(sc.nextLine());
        nhanVien.setTaxNumber(sc.nextLine());
        nhanVien.setContractDate(sc.nextLine());

        System.out.println(nhanVien);
    }
}
