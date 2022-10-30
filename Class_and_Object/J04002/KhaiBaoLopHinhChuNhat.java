package Class_and_Object.J04002;

import java.util.Scanner;

class Rectange {
    private double width, height;
    private String color;

    public Rectange() {
        this.width = 1d;
        this.height = 1.d;

    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String convertColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        if (width > 0 && height > 0) {
            return String.format("%d %d %s", (int)findPerimeter(), (int)findArea(), convertColor());
        }
        return "INVALID";
    }
}

public class KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange rectange = new Rectange();
        rectange.setWidth(sc.nextInt());
        rectange.setHeight(sc.nextInt());
        rectange.setColor(sc.next());

        System.out.println(rectange);
    }
}
