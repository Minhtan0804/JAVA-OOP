package String.J03010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<String> emailList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String email = sc.nextLine().toLowerCase();
            String[] str = email.trim().split("\\s+");
            email = "";
            for (int j = 0; j < str.length - 1; j++) {
                email += str[j].charAt(0);
            }

            email = str[str.length - 1] + email;
            emailList.add(email);
        }

        for (int i = 0; i < n - 1; i++) {
            int count = 2;
            for (int j = i + 1; j < n; j++) {
                if (emailList.get(i).equals(emailList.get(j))) {
                    emailList.set(j, emailList.get(j) + String.format("%d", count++));
                }
            }
        }

        for (String email : emailList)
            System.out.println(email + "@ptit.edu.vn");
    }
}
