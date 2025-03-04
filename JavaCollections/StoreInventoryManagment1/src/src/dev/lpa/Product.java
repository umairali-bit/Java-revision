package src.dev.lpa;


//using record because product should be immutable
//sku is short for stock keep unit, mfgr is manufacturer
public record Product(String sku, String name, String mfgr, Category category) {}
