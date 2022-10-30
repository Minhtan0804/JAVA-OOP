package Object_Array.J05036;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());

        List<SalePrice> salePriceList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SalePrice salePrice = new SalePrice(sc.nextLine(), sc.nextLine(),
                    Double.valueOf(sc.nextLine()), Double.valueOf(sc.nextLine()));
            salePriceList.add(salePrice);
        }

        for (SalePrice salePrice : salePriceList)
            System.out.println(salePrice);
    }
}
