package Object_Array.J05038;

import java.util.concurrent.atomic.AtomicInteger;

public class Payroll {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String fullName;
    private int dailySalary;
    private int workDays;
    private String position;
    private int basicSalary;
    private int bonus;
    private int allowance;
    private int realSalary;

    public Payroll(String fullName, int dailySalary, int workDays, String position) {
        this.ID = count.incrementAndGet();
        this.fullName = fullName;
        this.dailySalary = dailySalary;
        this.workDays = workDays;
        this.position = position;
        this.basicSalary = dailySalary * workDays;
        this.bonus = toBonus(workDays, basicSalary);
        this.allowance = toAllowance(position);
        this.realSalary = this.basicSalary + this.bonus + this.allowance;
    }

    public int toBonus(int n, int salary) {
        if (n >= 25)
            return salary / 5;
        else if (n >= 22)
            return salary / 10;

        return 0;
    }

    public int toAllowance(String pos) {
        if (pos.equals("GD"))
            return 250000;
        else if (pos.equals("PGD"))
            return 200000;
        else if (pos.equals("TP"))
            return 180000;

        return 150000;
    }

    public int getRealSalary() {
        return realSalary;
    }

    @Override
    public String toString() {
        return String.format("NV%02d %s %d %d %d %d", this.ID, this.fullName, this.basicSalary, this.bonus, this.allowance, this.realSalary);
    }
}
