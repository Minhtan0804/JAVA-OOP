package Input_Output_File.J07007;

import java.io.*;
import java.util.*;

public class WordSet {
    private Set<String> word = new TreeSet<>();

    WordSet(String fileName) {
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                for (String str : sc.nextLine().split("\\s+"))
                    word.add(str.toLowerCase());
            }
        } catch (Exception e) {
            // TODO: 10/7/2022
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (String str : word)
            res += str + "\n";
        return res;
    }
}
