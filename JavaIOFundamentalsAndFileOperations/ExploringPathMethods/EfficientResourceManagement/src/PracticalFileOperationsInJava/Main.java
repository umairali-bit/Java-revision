package PracticalFileOperationsInJava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

//        useFile("testFile.txt");
        usePath("testPath.txt");


    }

    private static void useFile(String fileName) {

        File file = new File(fileName);
        boolean fileExists = file.exists();

        System.out.printf("File %s %s%n",
                file,
                fileExists ? "exists" : "does not exist");

        if (fileExists) {
            System.out.println("Deleting the file " + fileName);
            fileExists = !file.delete();

        }

        if (!fileExists) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Something went wrong");
                ;
            }
            System.out.println("Created the file: " + fileName);

            if (file.canWrite()) {
                System.out.println("Would write to file here");
            }
        }
    }

        private static void usePath(String fileName) {

            Path path = Path.of(fileName);
            boolean fileExists = Files.exists(path);

            System.out.printf("File %s %s%n",
                    fileExists,
                    fileExists ? "exists" : "does not exist");

            if(fileExists){
                System.out.println("Deleting the file " + fileName);
                try {
                    Files.delete(path);
                    fileExists = false;
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            if(!fileExists){
                try {
                    Files.createFile(path);

                    System.out.println("Created the file: " + fileName);

                    if (Files.isWritable(path)) {
//                        System.out.println("Would write to file here");
                        Files.writeString(path, """
                                
                                Here is some data,
                                For my file,
                                just to prove,
                                Using the Files class Path better! 
                                """);
                    }
                    System.out.println("I can read too");
                    System.out.println("---------------");
                    Files.readAllLines(path).forEach(System.out::println);
                } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
    }
