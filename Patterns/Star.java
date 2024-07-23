package Patterns;

import java.util.Scanner;

class StarPatterns {

    public void squareStar(int row, int col) {
        System.out.println("Square or Rectangle Star : ");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void hollowSquareStar(int row, int col) {
        System.out.println("Hollow Square Star : ");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i == 1 || i == col) || (j == 1 || j == col))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void rhombusStar(int row, int col) {
        System.out.println("Rhombus or Parallelogram Star : ");

        String star = " ";
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(star);
            star += star;

        }
    }

    public void hollowReactangleStar(int row, int col) {
        System.out.println("Hollow Rectangle Star : ");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i == 1 || i == row) || (j == 1 || j == col ) )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


}

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and Column : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        StarPatterns sp = new StarPatterns();

        sp.squareStar(row, col);
        System.out.println();
        if(row==col)
        sp.hollowSquareStar(row, col);

        System.out.println();
        sp.rhombusStar(row, col);
        System.out.println();
        sp.hollowReactangleStar(row, col);

        sc.close();
    }
}