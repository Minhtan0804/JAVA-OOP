package String.J03023;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            int[] arr = new int[str.length()];

            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case 'I':
                        arr[i] = 1;
                        break;
                    case 'V':
                        arr[i] = 5;
                        break;
                    case 'X':
                        arr[i] = 10;
                        break;
                    case 'L':
                        arr[i] = 50;
                        break;
                    case 'C':
                        arr[i] = 100;
                        break;
                    case 'D':
                        arr[i] = 500;
                        break;
                    case 'M':
                        arr[i] = 1000;
                        break;
                }
            }
            
            int result = arr[str.length() - 1];

            for (int i = str.length() - 1; i > 0 ; i--) {
                if (arr[i] > arr[i - 1])
                    result -= arr[i - 1];
                else
                    result += arr[i - 1];
            }

            System.out.println(result);
        }
    }
}
