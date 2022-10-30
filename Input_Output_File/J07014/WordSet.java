package Input_Output_File.J07014;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> word = new TreeSet<>();

    public WordSet(String fileName){
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            ArrayList<String> list = (ArrayList<String>) input.readObject();
            for (String str : list)
                word.addAll(List.of(str.trim().toLowerCase().split("\\s+")));
        } catch (Exception e ) {

        }
    }

    public WordSet() {

    }

    public WordSet union(WordSet o) {
        WordSet set = new WordSet();
        set.word.addAll(this.word);
        set.word.addAll(o.word);
        return set;
    }

    public WordSet intersection(WordSet o) {
        WordSet set = new WordSet();
        set.word.addAll(this.word);
        set.word.retainAll(o.word);
        return set;
    }
}
