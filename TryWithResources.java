package exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;   // ← this was missing

public class TryWithResources {

    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("demo.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            }
            catch (IOException e) {
                System.out.println("file closed explicitly by programmer");
            }
        }
    }
}



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("demo.txt")) {   // no semicolon here
            System.out.println(fis);
        }
        catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        catch (IOException e) {
            System.out.println("error while handling the file");
        }
    }
}






