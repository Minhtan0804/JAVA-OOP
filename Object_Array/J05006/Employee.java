package Object_Array.J05006;

import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String fullName;
    private String sex;
    private String dateOfBirth;
    private String address;
    private String taxID;
    private String contractDate;

    public Employee(String fullName, String sex, String dateOfBirth,
                    String address, String taxID, String contractDate) {
        this.ID = count.incrementAndGet();
        this.fullName = fullName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.taxID = taxID;
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return String.format("%05d %s %s %s %s %s %s", this.ID, this.fullName,
                this.sex, this.dateOfBirth, this.address, this.taxID, this.contractDate);
    }
}
