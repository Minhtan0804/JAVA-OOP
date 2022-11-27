package Input_Output_File.J07014;

import java.io.*;
import java.util.*;

public class WordSet {
    private TreeSet<String> word = new TreeSet<>();

    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()) {
            this.word.add(sc.next().toLowerCase());
        }
    }

    public WordSet(TreeSet<String> set) {
        this.word = set;
    }

    public WordSet union(WordSet o) {
        TreeSet<String> set = new TreeSet<>();
        set.addAll(this.word);
        set.addAll(o.word);
        return new WordSet(set);
    }

    public WordSet intersection(WordSet o) {
        TreeSet<String> set = new TreeSet<>();
        for (String i : this.word) {
            if (o.word.contains(i))
                set.add(i);
        }

        return new WordSet(set);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (String str : this.word)
            res.append(str).append(" ");

        return res.toString();
    }
}
