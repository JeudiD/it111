import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;

        Scanner input  = new Scanner(System.in);

        System.out.println("Please enter the day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();

        //input.close();
        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");


        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();


        }




        String coffee;
        double price;


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
            default -> System.out.println("Please enter a valid day or check your spelling!");
        }


    }


}
