package Object_Array.J05032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());
        List<Age> ageList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Age age = new Age(sc.next(), sc.next());
            ageList.add(age);
        }

        System.out.println(Collections.min(ageList));
        System.out.println(Collections.max(ageList));
    }
}
