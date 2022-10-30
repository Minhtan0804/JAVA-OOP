package Contest_2.DanhSachThiICPC;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, Team> teamList = new HashMap<>();
        for (int i = 0; i < t; i++) {
            Team team = new Team(sc.nextLine(), sc.nextLine());
            teamList.put(team.getTeamID(), team);
        }

        int s = Integer.parseInt(sc.nextLine());
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            Student student = new Student(sc.nextLine(), sc.nextLine());
            studentArrayList.add(student);
        }

        Collections.sort(studentArrayList);

        for (Student student : studentArrayList) {
            System.out.print(student + " ");
            System.out.println(teamList.get(student.getTeamID()));
        }
    }
}
