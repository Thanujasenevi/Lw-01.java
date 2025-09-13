package LW01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = scanner.next();
        char middleChar = word.charAt(word.length() / 2);

        System.out.println(middleChar);

    }
}
