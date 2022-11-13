package Array.J02037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Array\\J02037\\Test"));

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            long length = 0;
            long even = 0;
            long odd = 0;
            String[] numbers = sc.nextLine().split("\\s+");

            for (int i = 0; i < numbers.length; i++) {
                length++;
                int num = Integer.parseInt(numbers[i]);
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if ((length % 2 == 0 && even > odd) || (length % 2 != 0 && even < odd))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
