package Input_Output_File.J07014;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        WordSet s1 = new WordSet("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07014\\DATA1.in");
//        WordSet s2 = new WordSet("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07014\\DATA2.in");
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
