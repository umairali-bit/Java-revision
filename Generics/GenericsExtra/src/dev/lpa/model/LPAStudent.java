package dev.lpa.model;

public class LPAStudent extends Student{


    private double percentageComplete;


    public LPAStudent () {
        percentageComplete = random.nextDouble(0, 100.001);
    }



    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentageComplete);
    }

    public double getPercentageComplete() {
        return percentageComplete;
    }
}
