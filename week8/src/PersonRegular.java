public class PersonRegular {

    public static void main (String [] args) {

        String firstPersonName = "Cathy";
        String secondPersonName = "Kendall";

        char firstPersonGender = 'F';
        char secondPersonGender = 'M';

        int firstPersonAge = 33;
        int secondPersonAge = 22;

        String firstPersonCar = "Volkswagon Bug";
        String secondPersonCar = "Mustang";

        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;

        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 670;

        double monthlyRate1;
        double monthlyRate2;

        double adjustedRate1;
        double adjustedRate2;




//violations/creditscore

        if (firstPersonViolations == true && firstPersonCreditScore <= 700) {

            monthlyRate1 = 500;

        } else {

            monthlyRate1 = 100;

        }

        if (secondPersonViolations == true && secondPersonCreditScore <= 700) {

            monthlyRate2 = 500;

        } else {

            monthlyRate2 = 100;

        }

//age/gender

        if (firstPersonAge <= 25 && firstPersonGender == 'F') {

            adjustedRate1 = 100;

        } else {

            adjustedRate1 = 0;

        }

        if (secondPersonAge <= 25 && secondPersonGender == 'M') {

            adjustedRate2 = 100;

        } else {

            adjustedRate2 = 0;

        }

        double total1 = monthlyRate1 + adjustedRate1;
        double total2 = monthlyRate2 + adjustedRate2;





        System.out.println("First person Name: " +firstPersonName);
        System.out.println("First person Gender: " +firstPersonGender);
        System.out.println("First person Age " +firstPersonAge);
        System.out.println("First person Car " +firstPersonCar);
        System.out.println("First person Violation " +firstPersonViolations);
        System.out.println("First person Credit Score " +firstPersonCreditScore);
        System.out.println("First person Final Monthly Rate " +total1);
        System.out.println("First person Preliminary Rate (including gender and age): " +monthlyRate1);
        System.out.println();

        System.out.println("Second person Name: " +secondPersonName);
        System.out.println("Second person Gender: " +secondPersonGender);
        System.out.println("Second person Age " +secondPersonAge);
        System.out.println("Second person Car " +secondPersonCar);
        System.out.println("Second person Violation " +secondPersonViolations);
        System.out.println("Second person Credit Score " +secondPersonCreditScore);
        System.out.println("Second person Monthly Rate " +total2);
        System.out.println("Second person Preliminary Rate (including gender and age): " +monthlyRate2);




    }



}
