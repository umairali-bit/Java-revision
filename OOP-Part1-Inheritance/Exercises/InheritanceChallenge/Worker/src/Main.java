public class Main {

    public static void main(String[] args) {

        Employee umair = new Employee("Umair", "10/25/1988", "09/06/2022");
        System.out.println(umair);
        System.out.println("Age is " + umair.getAge());
        System.out.println("Employee ID is " +umair.employeeId);
        System.out.println("Pay = " + umair.collectPay());


        salariedEmployee tim = new salariedEmployee("Tim", "11/07/1988", "09/06/2022",
                80000.00, false );
        System.out.println(tim);
        System.out.println("Tim's paycheck is $" + tim.collectPay());

        tim.retire();
        System.out.println(tim.collectPay());


        hourlyEmployee mary = new hourlyEmployee("Mary", "10/21/2000", "10/15/2023", 15);
        System.out.println(mary);
        System.out.println("Mary's payCheck = $"+ mary.collectPay());
        System.out.println("Mary's holiday pay = $"+ mary.getDoublePay());
    }
}
