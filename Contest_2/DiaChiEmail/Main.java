package Contest_2.DiaChiEmail;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest_2\\DiaChiEmail\\DANHSACH.in"));
//        Scanner sc = new Scanner(new File("DANHSACH.in"));

        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();

        while (n-- > 0) {
            String fullName = sc.nextLine().trim().toLowerCase();
            String[] str = fullName.split("\\s+");
            StringBuilder s = new StringBuilder();
            s.append(str[str.length - 1]);

            for (int i = 0; i < str.length - 1; i++)
                s.append(str[i].charAt(0));

            String email = s.toString();

            if (map.containsKey(email))
                map.put(email, map.get(email) + 1);
            else
                map.put(email, 1);

            String resEmail = email;
            if (map.get(email) > 1)
                resEmail += String.valueOf(map.get(email));

            System.out.println(resEmail + "@ptit.edu.vn");
        }
    }
}
