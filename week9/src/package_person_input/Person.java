package package_person_input;

public class Person {

    String name;

    char gender;

    int age;

    double baselineRate = 300;


    String zipCode;

    int cityCode;


    boolean violations;

    boolean violationDUI;

    boolean violationRedLight;

    boolean violationSpeeding;


    double creditScore;



    public void display() {

        System.out.println("This is the information you have provided.");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(zipCode);
        System.out.println("Baseline rate: " +baselineRate);
        System.out.println("Don't forget that your total rate may change due to violations, age, and credit score");
        System.out.println("Violations: " +violations);
        System.out.println("DUI Violation" +violationDUI);
        System.out.println("Red Light Violation: " +violationRedLight);
        System.out.println("Speeding Violation: " +violationSpeeding);
        System.out.println("Credit Score: " +creditScore);


    }

    //violations/creditscore
    public double getRate(double monthlyRate) {

        if(violations == true || creditScore <= 700) {

            monthlyRate = 300.00;

        } else {

            monthlyRate = 0;

        }

        return monthlyRate;

    }


    //age
    public double ageCategory(double adjustedRate) {

        if (age <= 25 || age >= 65) {

            adjustedRate = 300.00;

        } else {

            adjustedRate = 0;

        }

        return adjustedRate;

    }


    //convert string to integer/states, zipcodes
    public int identifyRegion (int states) {

        String zip2;
                                                            // 90 - 96 = CALI || 97 = OREGON || 98 and 99 = WASHINGTON
        zip2 = zipCode.substring(0, 2); //<--- we only want the first two numbers because first two will tell you the region
        cityCode = Integer.parseInt(zip2);


        if (cityCode >= 90 && cityCode < 97) {

            System.out.println("You entered " +cityCode+ " and you're from California");

        } else if (cityCode >= 97 && cityCode < 98) {

            System.out.println("You entered " +cityCode+ " and you're from Oregon");

        } else if (cityCode >= 98 && cityCode < 99) {

            System.out.println("You entered " +cityCode+ " and you're from Washington");

        } else {

            System.out.println("You're not from the PNW, please contact our National Office");

        }

        return states;
    }



    //charge for only californians because cars and pollution
    public double californiaRegion (double surcharge) {

        if (cityCode >= 90 && cityCode < 97) {

            surcharge = 200;

        } else {

            surcharge = 0;

        }

        return surcharge;

    }



}
