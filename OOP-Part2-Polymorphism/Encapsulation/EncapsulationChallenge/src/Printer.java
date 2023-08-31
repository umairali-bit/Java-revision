public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <=100){
        } else {
            tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        int tempAmount = tonerAmount + tonerLevel;
        if(tempAmount < 0 || tempAmount > 100){
            return -1;
        }
        //tonerAmount = tonerAmount + tonerLevel;
        tonerLevel+= tonerAmount;
        return tonerLevel;

    }

    public int printPages(int pages){

        int jobPages = 0;

        if(duplex){
            jobPages = (pages/2) + (pages%2);
            pagesPrinted += jobPages;

        }

        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
