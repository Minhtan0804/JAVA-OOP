package Input_Output_File.J07001;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}
