public class Employee extends Worker{


    protected long employeeId;
    private String hireDate;
    private static int employeeNo = 1;


    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        //static member
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

class salariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public salariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    @Override
    public double collectPay(){
       double payCheck = annualSalary / 26;
       double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;

       return (int) (adjustedPay);
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }
}

class hourlyEmployee extends Employee{
    double hourlyRate;

    public hourlyEmployee(String name, String birthDate, String hireDate, double hourlyRate) {
        super(name, birthDate, hireDate);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double collectPay(){
        return 40 * hourlyRate;

    }

    public double getDoublePay(){
        return 2 * collectPay();
        }


        }
