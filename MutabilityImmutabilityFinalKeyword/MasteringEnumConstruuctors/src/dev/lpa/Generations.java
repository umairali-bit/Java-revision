package dev.lpa;

public enum Generations {

    GEN_Z (2001, 2025),
    MILLENNIAL(1981,2000),
    GEN_X(1965,1980),
    BABY_BOOMER(1946, 1964),
    SILENT_GENERATION(1927,1945),
    GREATEST_GENERATION(1901,1926);

    private int startYear;
    private int endYear;


  Generations(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
        System.out.println(this + " " + startYear + " - " + endYear);
    }
}
