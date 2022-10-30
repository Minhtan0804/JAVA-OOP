package Input_Output_File.J07085;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<String> list = (ArrayList<String>) input.readObject();

        for (String str : list) {
            StringBuilder num = new StringBuilder();
            int val = 0;
            for (char i : str.toCharArray()) {
                if (Character.isDigit(i)) {
                    num.append(i);
                    val += Character.getNumericValue(i);
                }
            }

            BigInteger res = new BigInteger(num.toString());
            System.out.println(res + " " + val);
        }
    }
}
