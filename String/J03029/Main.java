package String.J03029;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\String\\J03029\\DATA.in"));
//        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] str = sc.nextLine().trim().toLowerCase().split("\\s+");
            ArrayList<String> list = new ArrayList<>();
            String res = "";
            for (String s : str) {
                if (s.equals(".") || s.equals("?") || s.equals("!")) {
                    list.add(res + "\b" + s);
                    res = "";
                } else if (s.contains(".")  || s.contains("?") || s.contains("!")) {
                    list.add(res + s);
                    res = "";
                } else
                    res += s + " ";
            }

            if (!res.isEmpty())
                list.add(res + "\b.");

            for (String s : list)
                arrayList.add(s.substring(0, 1).toUpperCase() + s.substring(1));
        }

        for (String s : arrayList)
            System.out.println(s);
    }
}
