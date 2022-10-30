package Java_Basic.HELLOFILE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HelloFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\DATA.in"));
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
