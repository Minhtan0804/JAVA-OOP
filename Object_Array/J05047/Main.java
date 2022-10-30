package Object_Array.J05047;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Merchandise> merchandiseArrayList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Merchandise merchandise = new Merchandise(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            String ID = merchandise.getProductName();
            if (map.containsKey(ID))
                map.put(ID, map.get(ID) + 1);
            else
                map.put(ID, 1);

            merchandise.setMerchandiseID(String.format("%s%02d", ID, map.get(ID)));
            merchandiseArrayList.add(merchandise);
        }

        Collections.sort(merchandiseArrayList);

        for (Merchandise merchandise : merchandiseArrayList)
            System.out.println(merchandise);
    }
}
