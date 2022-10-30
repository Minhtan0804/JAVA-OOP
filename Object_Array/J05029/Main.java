package Object_Array.J05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());

        List<Enterprise> enterpriseList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Enterprise enterprise = new Enterprise(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()));
            enterpriseList.add(enterprise);
        }

        Collections.sort(enterpriseList);

        int Q = Integer.valueOf(sc.nextLine());
        List<Query> queryList = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            Query query = new Query(sc.nextInt(), sc.nextInt());
            queryList.add(query);
        }

        for (Query query : queryList) {
            System.out.println(query);
            for (Enterprise enterprise : enterpriseList) {
                if (enterprise.getIntern() >= query.getLow() && enterprise.getIntern() <= query.getUp())
                    System.out.println(enterprise);
            }
        }
    }
}
