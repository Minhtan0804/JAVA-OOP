package Object_Array.J04018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ComplexNumber a = new ComplexNumber(sc.nextInt(), sc.nextInt());
            ComplexNumber b = new ComplexNumber(sc.nextInt(), sc.nextInt());

            System.out.println(b.addAndMulti(a) + ", " + a.squared(b) );
        }
    }
}
