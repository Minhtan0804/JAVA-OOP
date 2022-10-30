package Input_Output_File.J07040;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));

        ArrayList<String> arr = (ArrayList<String>) inputStream.readObject();
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : arr)
            Collections.addAll(list1, s.toLowerCase().split("\\s+"));

        ArrayList<String> list2 = new ArrayList<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            Collections.addAll(list2, str.toLowerCase().split("\\s+"));
        }

        ArrayList<String> list = new ArrayList<>();
        for (String str : list2) {
            if (!list.contains(str))
                list.add(str);
        }

        for (String str : list) {
            if (list1.contains(str))
                System.out.println(str);
        }
    }
}
