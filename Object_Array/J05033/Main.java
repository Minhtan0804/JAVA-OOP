package Object_Array.J05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Time> times = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Time temp = new Time(sc.nextInt(),
                    sc.nextInt(), sc.nextInt());
            times.add(temp);
        }

        Collections.sort(times);

        for (Time time : times)
            System.out.println(time);

        sc.close();
    }
}
