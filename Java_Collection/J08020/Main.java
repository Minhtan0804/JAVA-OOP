package Java_Collection.J08020;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            if (check(str))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '{')
                stack.add(str.charAt(i));
            else {
                if (!stack.isEmpty()) {
                    if (str.charAt(i) == ']' && stack.peek() == '[')
                        stack.pop();
                    else if (str.charAt(i) == ')' && stack.peek() == '(')
                        stack.pop();
                    else if (str.charAt(i) == '}' && stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                } else
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
