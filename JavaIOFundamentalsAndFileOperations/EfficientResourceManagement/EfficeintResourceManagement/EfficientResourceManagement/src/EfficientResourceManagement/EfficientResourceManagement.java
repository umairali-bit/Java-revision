package EfficientResourceManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EfficientResourceManagement {

    public static void main(String[] args) {



        String fileName = "test.cvc";
        Path paths = Paths.get(fileName);
//        try {
//            List<String> lines = Files.readAllLines(paths);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//      testFIle(fileName);
        testFIle2(null);


        File file = new File(fileName);

        if(!file.exists()){
            System.out.println("File doesn't exist");
            System.out.println("Quitting application");
        }
        System.out.println("File found I am good to go");


    }

    private static void testFIle(String fileName) {

        Path path = Paths.get(fileName);
        FileReader reader = null;
        try {
//            List<String> lines = Files.readAllLines(path);

            reader = new FileReader(fileName);
        } catch (IOException e) {
//            int result = 10 / 0;
            throw new RuntimeException(e);
        } finally {

            if (reader != null ) {
                try {
                    reader.close();
                } catch (IOException ignored) {}
            }
            System.out.println("File exits and I am able to use the resource");

        }
    }

    private static void testFIle2(String fileName) {

        try (FileReader reader = new FileReader(fileName)) {
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
            throw new RuntimeException(e);
        } catch (NullPointerException | IllegalArgumentException badData) {
            System.out.println("The user has bad data: " + badData.getMessage());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }  catch (Exception e) {
            System.out.println("Something unrelated or unexpected happened");
        }
        finally {
            System.out.println("Maybe Ill log something here");
        }

        System.out.println("File found I am good to go");
    }
}
