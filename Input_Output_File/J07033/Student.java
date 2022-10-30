package Input_Output_File.J07033;

import java.util.StringTokenizer;

public class Student implements Comparable<Student> {
    private String studentCode;
    private String fullName;
    private String className;
    private String email;


    public Student(String studentCode, String fullName, String className, String email) {
        this.studentCode = studentCode;
        this.fullName = normalization(fullName);
        this.className = className;
        this.email = email;
    }

    private String normalization(String s) {
        s = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        StringTokenizer str = new StringTokenizer(s);

        while (str.hasMoreTokens()) {
            String temp = str.nextToken();
            res.append(Character.toUpperCase(temp.charAt(0)));
            res.append(temp.substring(1));
            res.append(" ");
        }

        return res.toString().trim();
    }

    @Override
    public int compareTo(Student o) {
        if (this.studentCode.compareTo(o.studentCode) > 0)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return this.studentCode + " " + this.fullName + " " + this.className + " " + this.email;
    }
}
