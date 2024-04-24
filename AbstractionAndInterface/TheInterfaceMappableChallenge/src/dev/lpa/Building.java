package dev.lpa;

enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

public class Building {

    private String name;
    private UsageType usage;


    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }
}
