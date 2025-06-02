package package_person_homework;

public class PersonDetails {

    public static void main (String[] args) {

        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;


        //creating object from person class
        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();


        firstPerson.name = "Cathy Jones";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.carYear = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall Black";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.carYear = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Arial Fletcher";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.carYear = 2025;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

//        double monthlyRate = 0;
//        double adjustedRate = 0;
//        double carRepairCost = 0;

        // ^--we removed these variables from here and took these variables out of the arguments in getRate, assumeGender, and getCarInsurance--^
        // We never needed them, compiler only wanted something assigned because we were putting variables in the parameters in the top three
        // we never needed to do that, this way is much cleaner, all we had to do was initialize the variables within the methods of the three
        // at least this is the  best way I can wrap my head around this


        firstPerson.display();
        System.out.println("Preliminary Rate for " + firstPerson.name+ ": " + firstPerson.getRate()+ " dollars");
        System.out.println("Estimated cost of repairs are: " +firstPerson.getCarInsurance()+ " dollars");
        System.out.println("Adjustments: " + firstPerson.assumeGender()+ " dollars");
        System.out.print("Here is " + firstPerson.name+ "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender() + firstPerson.getRate() + firstPerson.getCarInsurance());

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name+ ": " + secondPerson.getRate()+ " dollars");
        System.out.println("Estimated cost of repairs are: " +secondPerson.getCarInsurance()+ " dollars");
        System.out.println("Adjustments: " + secondPerson.assumeGender()+ " dollars");
        System.out.print("Here is " + secondPerson.name+ "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender() + secondPerson.getRate() + secondPerson.getCarInsurance());

        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for " + thirdPerson.name+ ": " + thirdPerson.getRate()+ " dollars");
        System.out.println("Estimated cost of repairs are: " +thirdPerson.getCarInsurance()+ " dollars");
        System.out.println("Adjustments: " + thirdPerson.assumeGender()+ " dollars");
        System.out.print("Here is " + thirdPerson.name+ "'s total monthly premium: ");
        System.out.println(thirdPerson.assumeGender() + thirdPerson.getRate() + thirdPerson.getCarInsurance());

    }




}
