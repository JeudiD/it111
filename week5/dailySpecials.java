import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;
        String coffee = "";
        double price = 0.0;

        Scanner input  = new Scanner(System.in);

        System.out.println("Please enter the day of the week excluding weekends (Monday - Friday only!)");

        //specials = input.next();
        boolean valid = false;

        //input.close();
        //boolean saturday = specials.equalsIgnoreCase("Saturday");
        //boolean sunday = specials.equalsIgnoreCase("Sunday");

        //v----while loop wraps everything----v
        while (!valid) {

            specials = input.next();

//            switch (specials) {
//
//                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> valid = true;
//                case "Saturday", "Sunday" ->
//                        System.out.println("Please enter a weekday, not weekend!");
//                default -> System.out.println("Please enter a valid day or check your spelling!");
//
//
//            }
            //^-----replace this----^
                    //for
            //v---this---v || this gets rid of case sensitivity
            if (specials.equalsIgnoreCase("Saturday") || specials.equalsIgnoreCase("Sunday")) {

                System.out.println("Please enter a weekday, not weekend!");

            } else if (specials.equalsIgnoreCase("Monday") ||
                    specials.equalsIgnoreCase("Tuesday") ||
                    specials.equalsIgnoreCase("Wednesday") ||
                    specials.equalsIgnoreCase("Thursday") ||
                    specials.equalsIgnoreCase("Friday")) {

                valid = true;

            } else {

                System.out.println("Please enter a valid day or check your spelling!\n");

            }

            specials = specials.substring(0, 1).toUpperCase() + specials.substring(1).toLowerCase();

            if (valid) {

                switch (specials) {
                    case "Monday" -> {
                        coffee = "Latte";
                        price = 4.95;
                        System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                    }
                    case "Tuesday" -> {
                        coffee = "Frapp";
                        price = 5.95;
                        System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                    }
                    case "Wednesday" -> {
                        coffee = "Cappuccino";
                        price = 4.35;
                        System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                    }
                    case "Thursday" -> {
                        coffee = "Regular Joe";
                        price = 2.95;
                        System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                    }
                    case "Friday" -> {
                        coffee = "Green Tea Latte";
                        price = 6.95;
                        System.out.println(specials + "'s coffee of the day is " + coffee + " and the price will be $" + price);
                    }
                    default -> {
                        System.out.println("Please enter a valid day or check your spelling!");
                        input.close();
                        return;
                    }
                }

            }

        }


        System.out.println("How many " +coffee+ " would you like to order?");

        int quantity = input.nextInt();
        double total = quantity * price;

        switch (quantity) {

            case 0 -> {
                System.out.print("Looks like you dont like " +coffee+ "!  So sad!!!");

            }

            case 1 -> {
                System.out.print("Looks like you will be ordering only " +quantity+ " " +coffee+ " today!");

            }

            default -> {

            System.out.println(quantity + " " + coffee + " have been ordered totalling");
            System.out.printf("$%.2f dollars\n", total);
            }

        }



    }


}
