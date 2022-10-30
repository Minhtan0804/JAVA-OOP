package Class_and_Object.J04004;

import java.util.Scanner;

class Fraction{
    private long tu_so, mau_so;

    public Fraction() {
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }

    public Fraction(long tu_so, long mau_so) {
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }



    public long getTu_so() {
        return tu_so;
    }

    public void setTu_so(long tu_so) {
        this.tu_so = tu_so;
    }

    public long getMau_so() {
        return mau_so;
    }

    public void setMau_so(long mau_so) {
        this.mau_so = mau_so;
    }

    public long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void rutGon() {
        long temp = gcd(tu_so, mau_so);
        tu_so /= temp;
        mau_so /= temp;
    }

    public Fraction addFraction(Fraction a) {
        long tu_so = this.tu_so * a.mau_so + this.mau_so * a.tu_so;
        long mau_so = this.mau_so * a.mau_so;

        return new Fraction(tu_so, mau_so);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", tu_so, mau_so);
    }
}

public class TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction p1 = new Fraction();
        p1.setTu_so(sc.nextLong());
        p1.setMau_so(sc.nextLong());
        Fraction p2 = new Fraction();
        p2.setTu_so(sc.nextLong());
        p2.setMau_so(sc.nextLong());

        Fraction p = p1.addFraction(p2);
        p.rutGon();
        System.out.println(p);
    }
}
