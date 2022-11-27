package Input_Output_File.J07071;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07071\\DANHSACH.in"));
        Scanner sc = new Scanner(new File("DANHSACH.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<User> userArrayList = new ArrayList<>();
        while (n-- > 0) {
            User user = new User(sc.nextLine());
            userArrayList.add(user);
        }

        Collections.sort(userArrayList);
//        System.out.println(userArrayList);

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String query = sc.nextLine();
            int index = query.indexOf('*');
            for (User user : userArrayList) {
                if (index == -1) {
                    if (query.equals(user.getInitial()))
                        System.out.println(user);
                } else if (query.substring(0, index).equals(user.getInitial().substring(0, index)) &&
                        query.substring(index + 1).equals(user.getInitial().substring(index + 1)))
                    System.out.println(user);
            }
        }
    }
}
