package Contest.LuyenTapLapTrinh;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));

        int n = Integer.parseInt(sc.nextLine());
        List<Ranking> rankingList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Ranking ranking = new Ranking(sc.nextLine(), sc.nextLine());
//            ranking.toSumbitAndAnswer();
            rankingList.add(ranking);
        }

        Collections.sort(rankingList);

        for (Ranking ranking : rankingList)
            System.out.println(ranking);
    }
}
