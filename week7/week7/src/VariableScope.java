public class VariableScope {

    public static void main (String [] args) {

        String txt = "This is my local variable in the main method!";

        System.out.println(txt);

        sub();



    }

    public static void sub () {

        String txt = "This is the local variable in the sub method!";

        System.out.println(txt);



    }


}
