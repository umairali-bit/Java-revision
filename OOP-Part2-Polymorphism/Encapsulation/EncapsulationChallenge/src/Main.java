/*
Create a class named Printer with fields tonerLevel:int, pagesPrinted:int ,duplex:boolean
addToner(int tonerAmount): int, printPages(int pages): int. calling code should be able to
access these methods. addToner() takes the int tonerAmount as an argument. tonerAmount is added to the tonerLevel field.
the tonerLevel should never exceed 100 or even get lower than 0. return -1 if it falls out of the
range, otherwise return the actual tonerLevel. printPages should take argument pages to be printed as arguments.
it should determine how many sheets of paper, will be printed based on the duplex value,and return the sheet number from
the method. The sheet number should also be added to the pagesPrinted variable. If its a duplex printer. Print a message
that its duplex printer


 */



public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial pages = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.println(pagesPrinted + "....." + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.println(pagesPrinted + "......." + printer.getPagesPrinted());

    }
}
