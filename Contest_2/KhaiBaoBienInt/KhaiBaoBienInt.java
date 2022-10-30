package Contest_2.KhaiBaoBienInt;

import java.io.File;
import java.util.Scanner;

public class KhaiBaoBienInt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest_2\\KhaiBaoBienInt\\Code.cpp"));
//        Scanner sc = new Scanner(new File("Code.cpp"));
        int count = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.equals("int"))
                count++;
        }
        System.out.println(count*4);
    }
}
