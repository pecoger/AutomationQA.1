package qa.automation;

import java.util.Scanner;

public class MyOfficialJava {

    public static void main(String[] args) {

        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();

        System.out.println("Your name is: " + firstName);

        System.out.println("Please enter your age:");

        int userAge = scanner.nextInt();

        System.out.println("Your name is: " + firstName +
                "\nYour age is: " + userAge);

        if (userAge >= 18) {
            System.out.println(firstName + " can buy alcohol!!!");
        }

        if (userAge < 18) {
            System.out.println(firstName + " can't buy alcohol!!!");
        }

        if (userAge >=65) {
            System.out.println(firstName + " is retired");
        }

    }
}
