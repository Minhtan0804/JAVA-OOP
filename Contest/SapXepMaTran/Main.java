package Contest.SapXepMaTran;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\Contest\\SapXepMaTran\\MATRIX.in"));
        Scanner sc = new Scanner(new File("MATRIX.in"));

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int col = sc.nextInt();
            int[][] matrix = new int[n+1][m+1];

            for (int i = 1; i <=  n; i++) {
                for (int j = 1; j <=  m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n ; i++) {
                list.add(matrix[i][col]);
            }

            Collections.sort(list);

            int count = 0;
            for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= m ; j++) {
                    if (j == col)
                        System.out.printf("%d ", list.get(count++));
                    else
                        System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

//            System.out.println(list);
        }
    }
}
