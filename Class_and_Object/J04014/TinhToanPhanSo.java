package Class_and_Object.J04014;

import java.util.Scanner;

class Frac {
    private long tu_so, mau_so;

    public Frac() {

    }

    public Frac(long tu_so, long mau_so) {
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }

    public long gcd(long a, long b) {
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }

    public void rutGon() {
        long temp = gcd(tu_so, mau_so);

        tu_so /= temp;
        mau_so /= temp;
    }

    public Frac addFrac(Frac a) {
        long tu_so = this.tu_so * a.mau_so + a.tu_so * this.mau_so;
        long mau_so = this.mau_so * a.mau_so;

        return new Frac(tu_so, mau_so);
    }

    public Frac solve(Frac A, Frac B) {
        Frac C = new Frac();

        C = A.addFrac(B);
        C.rutGon();

        C.tu_so = C.tu_so * C.tu_so;
        C.mau_so = C.mau_so * C.mau_so;

        C.rutGon();

        return C;
    }

    public Frac solve(Frac A, Frac B, Frac C) {
        Frac D = new Frac();
        D.tu_so = A.tu_so * B.tu_so * C.tu_so;
        D.mau_so = A.mau_so * B.mau_so * C.mau_so;

        D.rutGon();

        return D;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", tu_so, mau_so);
    }
}

public class TinhToanPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            Frac A = new Frac(sc.nextLong(), sc.nextLong());
            Frac B = new Frac(sc.nextLong(), sc.nextLong());

            Frac C = new Frac();
            Frac D = new Frac();

            C = C.solve(A, B);
            D = D.solve(A, B, C);

            System.out.println(C + " " + D);
        }
    }
}
