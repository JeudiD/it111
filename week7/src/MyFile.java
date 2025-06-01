import java.io.File;

public class MyFile {

    public static void main (String [] args) {

        File dir = new File("TestFolder");

        if (dir.exists()) {

            System.out.println("Yippy Skippy, we  have a directory");

        } else {

            System.out.println("We are lost in space, don't know where that directory is?");


        }

    }

}
