package Contest_2.GiaTriNhiPhan;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) input.readObject();

        for (String s : list) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0' || s.charAt(i) == '1')
                    temp.append(s.charAt(i));
            }

            System.out.println(temp.toString() + " " + Long.parseLong(temp.toString(), 2));
        }
    }
}
