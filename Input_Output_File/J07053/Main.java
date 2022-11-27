package Input_Output_File.J07053;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Input_Output_File\\J07053\\XETTUYEN.in"));
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        ArrayList<Candidate> candidateArrayList = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Candidate candidate = new Candidate(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            candidateArrayList.add(candidate);
        }

        for (Candidate candidate : candidateArrayList)
            System.out.println(candidate);
    }

}
