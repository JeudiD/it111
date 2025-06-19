package package_person_input;

import java.util.Scanner;

public class PersonDetails {

    public static void main(String[] args) {

        Person customer;

        customer = new Person();

        int states = 0;

        System.out.println("Pleas enter your name");
        Scanner input = new Scanner(System.in);
        customer.name = input.next();

        System.out.println("Please enter your age");
        customer.age = input.nextInt();

        System.out.println("Please enter your your gender by entering F or M or N");
        customer.gender = input.next().charAt(0);

        System.out.println("Please enter your zipcode (only 5 numbers please)");
        customer.zipCode = input.next();

        System.out.println("Any traffic violations? Please enter true for yes, and false for no");
        customer.violations = input.nextBoolean();

        if (customer.violations == true) {

            System.out.println("Please type true if you had a DUI, or false if not");
            customer.violationDUI = input.nextBoolean();

            System.out.println("Please type true if you had a red light violation or false, if not");
            customer.violationRedLight = input.nextBoolean();

            System.out.println("Have you ever received any speeding tickets? Please type true for yes, or false for no tickets");
            customer.violationSpeeding = input.nextBoolean();
        }

        System.out.println("Please type in your credit score");
        customer.creditScore = input.nextDouble();
        customer.display();

        System.out.println(customer.identifyRegion(states));
        double surcharge = 0;
        System.out.println("Your california surcharge is " +customer.californiaRegion(surcharge));
        double adjustedRate = 0;
        System.out.println("Age Category adjustment:" +customer.ageCategory(adjustedRate));
        double monthlyRate = 0;
        System.out.println("Violations or credit score adjustment is " +customer.ageCategory(monthlyRate));
        System.out.println("Your new monthly premium will be: ");
        System.out.println(customer.baselineRate + customer.ageCategory(adjustedRate) + customer.californiaRegion(surcharge) + customer.getRate(monthlyRate));


    }

}
