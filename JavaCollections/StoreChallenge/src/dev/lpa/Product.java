package dev.lpa;


//using record because product should be immutableP
public record Product(String sku, String name, String mfgr, Category category) {}
