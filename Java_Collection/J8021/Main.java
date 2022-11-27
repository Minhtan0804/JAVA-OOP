package Java_Collection.J8021;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            System.out.println(check(str));
        }
    }

    public static int check(String str) {
        Stack<Integer> stack = new Stack<>();
        int maxx = 0;
        stack.add(-1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                stack.add(i);
            else {
                stack.pop();
                if (!stack.isEmpty())
                    maxx = Math.max(maxx, i - stack.peek());
                else
                    stack.add(i);
            }
        }
        return maxx;
    }
}