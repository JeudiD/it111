package package_person_homework;

public class Person {

    String name;

    char gender;

    int age;

    int carYear;

    boolean violations;

    double creditScore;


    public void display() {

        System.out.println("Customer Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Car Year: " +carYear);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);




    }


    public double getRate() {

        double monthlyRate;
        //violations doesn't need to be "violations == true".
        //v--this is cleaner--v || for false you can do !violations
        if (violations && creditScore <= 700) {

            monthlyRate = 500;

        } else {

            monthlyRate = 100;

        }

        return monthlyRate;

    }


    public double assumeGender () {

        double adjustedRate;

        if (gender == 'M' && age <= 25) {

            adjustedRate = 100;

        } else {

            adjustedRate = 0;

        }

        return adjustedRate;

    }


    public double getCarInsurance () {

        double carRepairCost;

        if (carYear >= 2024) {

            carRepairCost = 200;

        } else if (carYear >= 2022) {

            carRepairCost = 180;

        } else if (carYear >= 2020) {

            carRepairCost = 160;

        } else if (carYear >= 2015) {

            carRepairCost = 140;

        } else {

            carRepairCost = 100;

        }

        return carRepairCost;

    }

}
