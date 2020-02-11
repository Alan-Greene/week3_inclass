package inclass_3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int a_count = 0;
        int b_count = 0;
        int c_count = 0;
        int d_count = 0;
        int f_count = 0;

        System.out.println("Welcome to the grade calculator!");

        System.out.println("Please enter your your score: ");
        int score = in.nextInt();

        do {
            count ++;
            if (score >= 90 && score <= 100){
                a_count ++;
            }
            else if (score >= 80 && score <= 89){
                b_count ++;
            }
            else if (score >= 70 && score <= 79){
                c_count ++;
            }
            else if (score >= 60 && score <= 69){
                d_count ++;
            }
            else if (score >= 0 && score <= 59){
                f_count ++;
            } else {
                System.out.println("The score must be between 0 and 100.");
            }

            System.out.println("Please enter your your score: ");
            score = in.nextInt();

        } while (score > 0);

        System.out.printf("Total number of grades: %d%n" +
                "Total number of A's: %d%n" +
                "Total number of B's: %d%n" +
                "Total number of C's: %d%n" +
                "Total number of D's: %d%n" +
                "Total number of F's: %d", count, a_count, b_count, c_count, d_count, f_count);
    }
}
