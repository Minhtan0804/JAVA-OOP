import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().replaceAll("\\p{Punct}", " "));
    }
}