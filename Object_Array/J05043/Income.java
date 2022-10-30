package Object_Array.J05043;

import java.util.concurrent.atomic.AtomicInteger;

public class Income {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String ID;
    private String fullName;
    private String position;
    private int basicSalary;
    private int workDays;
    private int posAllowance;
    private int salary;
    private int advance;
    private int remain;

    public Income(String fullName, String position, int basicSalary, int workDays) {
        this.ID = String.format("NV%02d", count.incrementAndGet());
        this.fullName = fullName;
        this.position = position;
        this.basicSalary = basicSalary;
        this.workDays = workDays;
        this.posAllowance = toAllowancce(position);
        this.salary = basicSalary * workDays;
        this.advance = toAdvance(salary, this.posAllowance);
        this.remain = this.salary + this.posAllowance - this.advance;
    }

    public int toAllowancce(String position) {
        if (position.equals("GD"))
            return 500;
        else if (position.equals("PGD"))
            return 400;
        else if (position.equals("TP"))
            return 300;
        else if (position.equals("KT"))
            return 250;
        else
            return 100;
    }

    public int toAdvance(int salary, int posAllowance) {
        int temp = salary + posAllowance;
        if (temp * 2 / 3 < 25000)
            return Math.round(temp * 2 / 3 / 1000) * 1000 ;
        else
            return 25000;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", this.ID, this.fullName, this.posAllowance, this.salary, this.advance, this.remain);
    }
}
