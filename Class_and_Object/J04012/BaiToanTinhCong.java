package Class_and_Object.J04012;

import java.util.Scanner;

class Staff {
    private String fullName, title;
    private int basicSalary, workdays;

    private int salary, bonus, allowance, total;

    public Staff() {

    }

    public Staff(String fullName, int basicSalary,
                 int workdays, String title) {
        this.fullName = fullName;
        this.basicSalary = basicSalary;
        this.workdays = workdays;
        this.title = title;
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

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void payroll() {
        salary = basicSalary * workdays;

        if (workdays >= 25) {
            bonus = salary / 5;
        } else if (workdays >= 22) {
            bonus = salary / 10;
        } else {
            bonus = 0;
        }

        switch (title) {
            case "GD":
                allowance = 250000;
                break;
            case "PGD":
                allowance = 200000;
                break;
            case "TP":
                allowance = 180000;
                break;
            case "NV":
                allowance = 150000;
                break;
            default:
                allowance = 0;
        }

        total = salary + bonus + allowance;
    }

    @Override
    public String toString() {
        return String.format("NV01 %s %d %d %d %d", fullName, salary,
                bonus, allowance, total);
    }
}

public class BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff staff = new Staff();

        staff.setFullName(sc.nextLine());
        staff.setBasicSalary(sc.nextInt());
        staff.setWorkdays(sc.nextInt());
        String temp = sc.nextLine();
        staff.setTitle(sc.nextLine());

        staff.payroll();

        System.out.println(staff);
    }
}
