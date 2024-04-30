package dev.lpa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {


    public static void main(String[] args) {


        Student s1 = new Student();
        s1.stuRollNo = 5;
        s1.stuName = "John";

        String fileName = ("/Downloads/TestFile.txt");

        try {

            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);


            oos.close();
            fos.close();

            System.out.println("Object saved in the file");
        }

        catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
