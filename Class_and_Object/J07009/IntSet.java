package Class_and_Object.J07009;

import java.util.TreeSet;

public class IntSet {
    private final int[] arr;

    public IntSet(int[] arr) {
        this.arr = arr;
    }

    public IntSet intersection(IntSet o) {
        TreeSet<Integer> mySet = new TreeSet<>();
        TreeSet<Integer> result = new TreeSet<>();
        for (int i : arr)
            mySet.add(i);
        for (int i : o.arr)
            if (mySet.contains(i))
                result.add(i);
        return new IntSet(result.stream().mapToInt(Integer::intValue).toArray());
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i : arr)
            res.append(i).append(" ");
        return res.toString();
    }
}
