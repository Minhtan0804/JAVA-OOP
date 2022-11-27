package Input_Output_File.J07071;

public class User implements Comparable<User> {
    private String fullName;
    private String initial;
    private String name;

    public User(String fullName) {
        this.fullName = fullName;
        this.initial = toGetInitial(fullName);
        this.name = toGetName(fullName);
    }

    private String toGetInitial(String fullName) {
        String[] str = fullName.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String i : str)
            res.append(i.substring(0,1).toUpperCase()).append(".");
        return res.toString().substring(0, res.length() - 1);
    }

    private String toGetName(String fullName) {
        String[] str = fullName.split("\\s+");
        return str[str.length - 1];
    }

    public String getInitial() {
        return initial;
    }

    @Override
    public int compareTo(User o) {
        if (this.name.compareTo(o.name) > 0)
            return 1;
        else if (this.name.equals(o.name) && this.fullName.compareTo(o.fullName) > 0)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
