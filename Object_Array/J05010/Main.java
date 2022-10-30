package Object_Array.J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Item item = new Item(sc.nextLine(), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            itemList.add(item);
        }

        Collections.sort(itemList);

        for (Item item : itemList)
            System.out.println(item);
    }
}
