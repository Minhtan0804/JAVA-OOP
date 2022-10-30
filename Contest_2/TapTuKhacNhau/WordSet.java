package Contest_2.TapTuKhacNhau;

import java.util.*;

public class WordSet {
    private final String str;

    public WordSet(String str) {
        this.str = str.toLowerCase();
    }

    public String getStr() {
        return str;
    }

    public String union(WordSet s) {
        String temp = s.getStr();
        String[] s1 = temp.split("\\s+");
        String[] s2 = this.str.split("\\s+");
        Set<String> set = new HashSet<String>();

        Collections.addAll(set, s1);
        Collections.addAll(set, s2);

        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);
        StringBuilder res = new StringBuilder();

        for (String value : list)
            res.append(value).append(" ");

        return res.toString();
    }

    public String intersection(WordSet s) {
        String temp = s.getStr();
        String[] s1 = temp.split("\\s+");
        String[] s2 = this.str.split("\\s+");

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();

        StringBuilder res = new StringBuilder();

        Collections.addAll(set1, s1);
        Collections.addAll(set2, s2);
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set2);
        Collections.sort(list);
        for (String value : list) {
            if (set1.contains(value))
                res.append(value).append(" ");
        }

        return res.toString();
    }
}
