package MasteringJavaExceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        String fileName = "test.cvc";
        Path paths = Paths.get(fileName);
//        try {
//            List<String> lines = Files.readAllLines(paths);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        testFIle(fileName);

        File file = new File(fileName);

        if(!file.exists()){
            System.out.println("File doesn't exist");
            System.out.println("Quitting application");
        }
        System.out.println("File found I am good to go");


    }

    private static void testFIle(String fileName) {
        Path path = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(path);
        } catch (IOException e) {
            int result = 10 / 0;
        } finally {
            System.out.println("File exits and I am able to use the resource");

        }



    }
}
