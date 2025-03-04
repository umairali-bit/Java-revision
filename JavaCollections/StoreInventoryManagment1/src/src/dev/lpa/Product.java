package src.dev.lpa;


//using record because product should be immutable
public record Product(String sku, String name, String mfgr, Category category) {}
