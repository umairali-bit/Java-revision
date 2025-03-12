package dev.lpa;

public class Student {

    private final String name;
    private final StringBuilder studentNotes;


    public Student(String name, StringBuilder studentNotes) {
        this.name = name;
        this.studentNotes = new StringBuilder(studentNotes);
    }


    public String getName() {
        return name;
    }

    public StringBuilder getStudentNotes() {
        return studentNotes;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentNotes=" + studentNotes +
                '}';
    }
}
