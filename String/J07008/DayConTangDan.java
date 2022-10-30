package String.J07008;

import java.util.*;

public class DayConTangDan {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (String num : sc.nextLine().split("\\s+"))
            arr.add(Integer.parseInt(num));

        Collections.sort(arr);


    }
}
