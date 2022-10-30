package Input_Output_File.J07041;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> pairArrayList = (ArrayList<Pair>) input.readObject();

        Collections.sort(pairArrayList);

        for (Pair pair : pairArrayList) {
            if (pair.getFirst() < pair.getSecond())
                System.out.println(pair);
        }
    }
}
