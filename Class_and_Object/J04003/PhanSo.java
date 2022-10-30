package Class_and_Object.J04003;

import java.util.Scanner;

class PhanSoo {
    private long tu_so, mau_so;

    public PhanSoo() {
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }

    public PhanSoo(long tu_so, long mau_so) {
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
        if (b == 0) return a;

        return gcd(b, a % b);
    }

    public void rutGon() {
        long temp = gcd(tu_so, mau_so);
        tu_so /= temp;
        mau_so /= temp;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", tu_so, mau_so);
    }
}

public class PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSoo x = new PhanSoo();
        x.setTu_so(sc.nextLong());
        x.setMau_so(sc.nextLong());

        x.rutGon();
        System.out.println(x);
    }
}
