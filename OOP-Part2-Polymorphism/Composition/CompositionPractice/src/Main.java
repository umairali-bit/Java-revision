public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Accer", 27,"2540X440" );
        Motherboard theMotherboard = new Motherboard("BJ200", "Assus", 4,6,"v2.44");

        PersonalComputer pc = new PersonalComputer("2208", "Dell", theCase,theMonitor,theMotherboard);

//        pc.getMonitor().drawPixel(10,10,"red");
//        pc.getMotherboard().loadProgram("MacOS");
//        pc.getComputerCase().pressPowerButton();

        pc.power();


    }
}
