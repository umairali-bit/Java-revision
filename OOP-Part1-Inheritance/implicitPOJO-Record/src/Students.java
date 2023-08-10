public class Students {
    private String id;
    private String name;
    private String dateOfbirth;
    private String classList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    // record can generate constructor, accessor methods and toString() in the back.
    public Students(String id, String name, String dateOfbirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfbirth = dateOfbirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfbirth='" + dateOfbirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

}
