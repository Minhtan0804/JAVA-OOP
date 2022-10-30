package Object_Array.J05007;

import java.util.concurrent.atomic.AtomicInteger;

public class Employee implements Comparable<Employee> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String fullName;
    private String sex;
    private String dateOfBirth;
    private String address;
    private String taxID;
    private String contractDate;
    private int day, month, year;

    public Employee(String fullName, String sex, String dateOfBirth,
                    String address, String taxID, String contractDate) {
        this.ID = count.incrementAndGet();
        this.fullName = fullName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.taxID = taxID;
        this.contractDate = contractDate;
        this.day = Integer.valueOf(dateOfBirth.substring(0,2));
        this.month = Integer.valueOf(dateOfBirth.substring(3,5));
        this.year = Integer.valueOf(dateOfBirth.substring(6));
    }

    @Override
    public String toString() {
        return String.format("%05d %s %s %s %s %s %s", this.ID, this.fullName,
                this.sex, this.dateOfBirth, this.address, this.taxID, this.contractDate);
    }

    @Override
    public int compareTo(Employee o) {
        if (this.year > o.year)
            return 1;
        if (this.year == o.year && this.month > o.month)
            return 1;
        if (this.year == o.year && this.month == o.month && this.day > o.day)
            return 1;

        return -1;
    }
}
