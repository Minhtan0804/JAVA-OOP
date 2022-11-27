package Java_Collection.JKT013;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            luckyNumber(n);
        }
    }

    public static void luckyNumber(int n) {
        HashSet<Long> set = new HashSet<>();
        Queue<String> queue = new LinkedList<String>();
        queue.add("6");
        queue.add("8");
        while (!queue.isEmpty()) {
            String num = queue.poll();
            if (num.length() <= n)
                set.add(Long.parseLong(num));
            else
                break;
            queue.add(num + "6");
            queue.add(num + "8");
        }

        System.out.println(set.size());

        List<Long> list = new LinkedList<>(set);
        Collections.sort(list, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return o1 < o2 ? 1 : -1;
            }
        });

        for (Long num : list)
            System.out.print(num + " ");
        System.out.println();

    }
}
