package Graphs;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double N=sc.nextDouble();
        double R1=sc.nextDouble();//plastic 
        double R2=sc.nextDouble();//glass
        double R3=sc.nextDouble();//glass if returned

        double R4=R2-R3;

        milkLitre(R1,R4,N);
    }

    private static void milkLitre(double r1, double r4, double n) {
        double glass=n/r4;
        double glassRem=n%r4;
        double plastic=n/r1;
        double plasticRem=n%r1;
        int litre=0;

        

        System.out.println(litre);
    }
}
