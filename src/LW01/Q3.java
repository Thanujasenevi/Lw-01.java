package LW01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length in cm");
        double cm = scanner.nextDouble();
        double Inch = cm / 2.54;
        int feet = (int) (Inch / 12);
        double reminder = Inch % 12 ;
        System.out.println(cm+"cm is equal to"+feet+"feet and "+reminder+"inches");


    }
}
