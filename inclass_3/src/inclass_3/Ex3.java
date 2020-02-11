package inclass_3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press eny key to continue or \"Q\" to quit: ");
        String user_choice = in.nextLine();
        double degrees_f = 0.0;
        double degrees_c = 0.0;

        while (!user_choice.equals("Q") && !user_choice.equals("q")) {
            System.out.println("Please enter your degrees followed by a \"C\" or an \"F\"");
            String input = in.nextLine();
            String choice = input.substring(input.length() - 1);
            String number = input.substring(0, input.length() - 1);
            double degrees = Integer.parseInt(number);
            String eol = "";

            String[] values = {"c","C","f","F"};
            boolean contains = Arrays.asList(values).contains(choice);

            if (!contains){
                System.out.println("The value you entered did not end in \"c\" or \"f\"");
                System.out.println("Please enter your degrees followed by a \"C\" or an \"F\"");
                input = in.nextLine();
                choice = input.substring(input.length() - 1);
                number = input.substring(0, input.length() - 1);
                degrees = Integer.parseInt(number);
            }

            if (choice.equals("c") || choice.equals("C")) {
                degrees_f = (9.0 / 5.0) * degrees + 32;
                System.out.printf("FROM: %.2fc%n" +
                        "TO: %.2ff", degrees, degrees_f);
            } else if (choice.equals("f") || choice.equals("F")) {
                degrees_c = ((degrees - 32) * 5) / 9;
                System.out.printf("FROM: %.2ff%n" +
                        "TO: %.2fc", degrees, degrees_c);
            } else {
                System.out.println("Error");
            }

            eol = in.nextLine();
            System.out.println("Press eny key to continue or \"Q\" to quit: ");
            user_choice = in.nextLine();
        }
    }
}
