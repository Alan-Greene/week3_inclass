package inclass_3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double total_hours = 0.0;

        System.out.println("Welcome to sleep calculator!\n" +
                "Please enter the house name: ");

        String house_name = in.nextLine();

        System.out.println("Please press 1 to enter or 0 to exit");
        int user_choice = in.nextInt();

        while (user_choice != 0){
            System.out.println("Please enter the average number of hours you sleep: ");
            total_hours += in.nextDouble();
            count ++;
            System.out.println("Please press 1 to enter or 0 to exit");
            user_choice = in.nextInt();
        }

        double average_hours = total_hours / count;

        System.out.printf("House: %s%n" +
                "Total hours: %.1f%n" +
                "Number of students: %d%n" +
                "Average hours: %.1f", house_name, total_hours, count, average_hours);
    }
}
