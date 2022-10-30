package Class_and_Object.J04015;

import java.util.Scanner;

class Income {
    private String id, fullName;
    private int basicSalary;

    private String title;
    private int allowance, coeff, totalIncome;

    public Income() {

    }

    public Income(String id, String fullName, int basicSalary) {
        this.id = id;
        this.fullName = fullName;
        this.basicSalary = basicSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void payroll() {
        title = id.substring(0,2);
        coeff = Integer.valueOf(id.substring(2));

        if (title.compareTo("HT") == 0) {
            allowance = 2000000;
        } else if (title.compareTo("HP") == 0) {
            allowance = 900000;
        } else {
            allowance = 500000;
        }

        totalIncome = basicSalary * coeff + allowance;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", id, fullName, coeff, allowance, totalIncome);
    }
}

public class TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Income income = new Income();

        income.setId(sc.nextLine());
        income.setFullName(sc.nextLine());
        income.setBasicSalary(sc.nextInt());

        income.payroll();
        System.out.println(income);
    }
}
