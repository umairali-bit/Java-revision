package ExploringPathMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {

        Path path = Path.of("this/is/several/folders/testing.txt");

//        printPathInfo(path);

       Main main = new  Main();
       main.extraInfo(path);

        logStatement(path);



    }

    private static void printPathInfo(Path path) {

        System.out.println("Path: " + path);
        System.out.println("File: " + path.getFileName());
        System.out.println("Directory: " + path.getParent());
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute Path: " + path.toAbsolutePath());
        System.out.println("isBoolean: " + path.isAbsolute());
        System.out.println("Absolute Path Route: " +  path.toAbsolutePath());

        System.out.println(absolutePath.getRoot());
//        int i = 1;
//        var it = path.toAbsolutePath().iterator();
//        while (it.hasNext()) {
//            System.out.println("." .repeat(i++) + " " + it.next());
//        }

        int pathParts = absolutePath.getNameCount();
        for (int i = 0; i < pathParts; i++) {
            System.out.println("." .repeat(i + 1) +  absolutePath.getName(i));
        }
        System.out.println("----------------------------------");


    }

    private static void logStatement(Path path) {
        try{
            Path parent = path.getParent();
            if (!Files.exists(parent)) {
//                Files.createDirectory(parent);
                Files.createDirectories(parent);
            }

            Files.writeString(path, Instant.now() + " hello file world\n",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void extraInfo(Path path) {

        try{
            var atts = Files.readAttributes(path, "*");
            atts.entrySet().forEach(entry -> System.out.println(entry));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
