package Contest.GhepMa;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<String> list1 = (ArrayList<String>) inputStream1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) inputStream2.readObject();

        TreeSet<String> str = new TreeSet<>();
        str.addAll(list1);

        TreeSet<Integer> num = new TreeSet<>();
        num.addAll(list2);

        for (String i : str) {
            for (Integer j : num){
                System.out.println(i + j);
            }
        }
    }
}
