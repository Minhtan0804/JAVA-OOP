package Java_Collection.J08024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            minDividen(n);
        }
    }

    public static void minDividen(int n) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("9");

        while (!queue.isEmpty()) {
            String num = queue.poll();
            if (Integer.parseInt(num) % n == 0) {
                System.out.println(num);
                break;
            }
            queue.add(num + "0");
            queue.add(num + "9");
        }
    }
}
