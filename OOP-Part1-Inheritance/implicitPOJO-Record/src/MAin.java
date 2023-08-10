public class MAin {
    public static void main(String[] args) {
        for(int i =1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S98000" + i,
                    switch(i){
                case 1 -> "Harry";
                case 2 -> "Hermione";
                case 3 -> "Jacob";
                case 4 -> "Anglena";
                case 5 -> "Julia";
                default -> "Anonymous";

                    },
                   switch(i){
                case 1 -> "10/25/1988";
                case 2 -> "10/25/1999";
                case 3 -> "10/25/2000";
                case 4 -> "10/25/2001";
                case 5 -> "10/25/2002";
                default -> "No Birth date found";
                   },
                    switch(i){
                case 1-> "Java";
                case 2 -> "Python";
                case 3 -> "JavaScript";
                case 4 -> "Mobile development";
                case 5 -> "Web development";
                default -> "No classes found";
                    });
            System.out.println(s);
        }

        // difference between pojo and record
        // create two new refernces of the classes Students and LPAStudent. One with POJO and one with record
        Students pojoStudent = new Students("S98000", "Ann", "05/10/1990", "Advanced Java");
        LPAStudent recordStudent = new LPAStudent("S98022", "Bill", "05/10/1992", "SpringBoot");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        // if you wanna add more classList to existing class list
        // for POJO
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Spring MVC");
        //recordStudent.setClassList(recordStudent.setClassList() + ", Spring MVC");

        // we cant do the same thing with record because the record class in immutable, or final

        //Students class have accessor methods but LPAStudent class have nothing in it.
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());



    }


}
