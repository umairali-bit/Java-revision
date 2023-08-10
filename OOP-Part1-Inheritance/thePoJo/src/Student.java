// student POJO class to represent Entity Student

public class Student {

    private String Id;
    private String name;
    private String dateOfBirth;
    private String classList;


    //making POJO
    //constructor with the fields
    public Student(String Id, String name, String dateOfBirth, String classList) {
        this.Id = Id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    // another way control the output of System.out.println() is to use toString()
    @Override
    public String toString() {
        return "Student{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
