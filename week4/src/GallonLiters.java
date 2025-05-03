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

            for (gal = 1; gal <=100; gal = gal+4) {

                lit = (gal * 3.78541);

                System.out.printf("%.2f Liters = %.1f Gallons%n", lit, gal);

                count++;

                if (count % 5 == 0){
                    System.out.println();
                }
            }

        System.out.println("We Are Done!!!!");

    }

}
