package Input_Output_File.J07072;

public class FullName implements Comparable<FullName> {
    private String firstName;
    private String middleName;
    private String lastName;

    public FullName(String fullName)  {
        String[] str = capitalize(fullName).split("\\s+");
        this.firstName = str[0];
        String temp = "";
        for (int i = 1; i < str.length - 1 ; i++)
            temp += str[i] + " ";
        this.middleName = temp;
        this.lastName = str[str.length - 1];
    }

    public static String capitalize(String str) {
        String[] s = str.toLowerCase().trim().split("\\s+");
        String res = "";

        for (String temp : s) {
            res += temp.substring(0, 1).toUpperCase() + temp.substring(1) + " ";
        }

        return res;
    }

    @Override
    public int compareTo(FullName o) {
        if (this.lastName.compareTo(o.lastName) > 0)
            return 1;
        if (this.lastName.compareTo(o.lastName) == 0 && this.firstName.compareTo(o.firstName) > 0)
            return 1;
        if (this.lastName.compareTo(o.lastName) == 0 && this.firstName.compareTo(o.firstName) == 0 && this.middleName.compareTo(o.middleName) > 0)
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.middleName + this.lastName;
    }
}
