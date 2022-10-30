package String.J03009;

import java.util.*;
import java.util.stream.Collectors;

public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while (t-- > 0) {
            String[] str1 = sc.nextLine().split("\\s+");
            String[] str2 = sc.nextLine().split("\\s+");

            ArrayList<String> str = new ArrayList<>();

            for (int i = 0; i < str1.length; i++) {
                boolean haveOther = true;
                for (int j = 0; j < str2.length; j++) {
                    if (str1[i].equals(str2[j])) {
                        haveOther = false;
                        break;
                    }
                }

                if (haveOther) {
                    boolean have = false;
                    for (int j = 0; j < str.size(); j++) {
                        if (str.get(j).equals(str1[i])) {
                            have = true;
                            break;
                        }
                    }
                    if (!have)
                        str.add(str1[i]);
                }
            }

            str.sort(Comparator.naturalOrder());

            for (String s : str)
                System.out.printf(s + " ");
            System.out.println();
        }
    }
}
