package Object_Array.J04018;

public class ComplexNumber {
    private int real;
    private int image;

    public ComplexNumber(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public ComplexNumber addAndMulti(ComplexNumber a) {
        int r = a.real + this.real;
        int i = a.image + this.image;
        int temp = r;

        r = r * a.real - i * a.image;

        i = temp * a.image + i * a.real;
        return new ComplexNumber(r, i);
    }

    public ComplexNumber squared(ComplexNumber a) {
        int r = a.real + this.real;
        int i = a.image + this.image;

        return new ComplexNumber(r * r - i * i, 2 * r * i);
    }

    @Override
    public String toString() {
        String temp = "";
        if (this.image < 0)
            temp += "- " + Integer.toString(Math.abs(this.image));
        else
            temp += "+ " + Integer.toString(this.image);
        return String.format("%d %si", this.real, temp);
    }
}
