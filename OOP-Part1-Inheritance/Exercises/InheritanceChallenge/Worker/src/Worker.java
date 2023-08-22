public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }


    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public int getAge(){
        int currentYear = 2023;
        //we use a wrapper class to turn a string into an integer
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;

    }
}
