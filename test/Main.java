package test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> pairArrayList = (ArrayList<Pair>) input.readObject();

        Collections.sort(pairArrayList);

        for (Pair pair : pairArrayList) {
            if (pair.getFirst() < pair.getSecond() && isCoPrime(pair))
                System.out.println(pair);
        }
    }

    public static boolean isCoPrime(Pair pair) {
        return gcd(pair.getFirst(), pair.getSecond()) == 1;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
