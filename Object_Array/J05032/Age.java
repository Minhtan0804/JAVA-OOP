package Object_Array.J05032;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Age implements Comparable<Age> {
    private String name;
     private Date dateOfBirth;

    public Age(String name, String dateOfBirth) throws Exception {
        this.name = name;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);;
    }

    @Override
    public int compareTo(Age o) {
        return this.dateOfBirth.compareTo(o.dateOfBirth) < 0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
