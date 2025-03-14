package dev.lpa;

public class Student {

    private final String name;
    private final StringBuilder studentNotes;


    public Student(String name, StringBuilder studentNotes) {
        this.name = name;
        this.studentNotes = studentNotes;
    }

//    protected Student(Student s) {
//
//        this.name = s.name;
//        this.studentNotes = s.studentNotes;
//
//
//    }


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
