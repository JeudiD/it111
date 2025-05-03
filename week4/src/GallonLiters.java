public class GallonLiters {

    public static void main(String[] args) {

//            double lit, gal;
//
//            for (lit = 0; lit <= 100; lit = lit+1) {
//
//                gal = (lit * 9/5) + 32;
//                System.out.println(lit + " Liters = " +gal+ " Gallons");
//
//            }
//
//            System.out.println("All done!");

        double lit, gal;
        int count = 0;

            for (lit = 1; lit <=100; lit = lit+4) {

                gal = (lit * 3.78541);

                System.out.printf("%.2f Liters = %.2f Gallons%n", gal, lit);

                count++;

                if (count % 5 == 0){
                    System.out.println();
                }
            }

        System.out.println("We Are Done!!!!");

    }

}
