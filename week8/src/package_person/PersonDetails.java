package package_person;

public class PersonDetails {

    public static void main (String[] args) {

        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;


        //creating object from person class
        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();


        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = "Voltswagon Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = "Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Arial";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.car = "Lexus";
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

        double monthlyRate = 0;
        double adjustedRate = 0;


        // v---what we needed before display---v
//        System.out.println(firstPerson.name);
//        System.out.println(firstPerson.gender);
//        System.out.println(firstPerson.age);
//        System.out.println(firstPerson.car);
//        System.out.println(firstPerson.violations);
//        System.out.println(firstPerson.creditScore);
//
//        System.out.println();
//
//        System.out.println(secondPerson.name);
//        System.out.println(secondPerson.gender);
//        System.out.println(secondPerson.age);
//        System.out.println(secondPerson.car);
//        System.out.println(secondPerson.violations);
//        System.out.println(secondPerson.creditScore);

        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ ": " +firstPerson.getRate(monthlyRate)+ " dollars");
        System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": " +secondPerson.getRate(monthlyRate)+ " dollars");
        System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate));

        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for " +thirdPerson.name+ ": " +thirdPerson.getRate(monthlyRate)+ " dollars");
        System.out.println("Adjustments: " +thirdPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.print("Here is " +thirdPerson.name+ "'s total monthly premium: ");
        System.out.println(thirdPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate));

    }




}
