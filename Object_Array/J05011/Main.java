package Object_Array.J05011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Gamer> gamerList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Gamer gamer = new Gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            gamer.calcTime();
            gamerList.add(gamer);
        }

        Collections.sort(gamerList);

//        System.out.println(gamerList.get(1));

        for (Gamer gamer : gamerList)
            System.out.println(gamer);
    }
}
