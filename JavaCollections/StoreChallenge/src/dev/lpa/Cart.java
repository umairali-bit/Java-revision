package dev.lpa;

import java.time.LocalDate;
import java.util.Map;

public class Cart {

    enum CartType {PHYSICAL, VIRTUAL};

    private static int lastId = 1; //cart number
    private int id;
    private LocalDate cartDate;
    private CartType type;
    private Map<String, Integer> products; //string will be product sku, Integer will be the quantity ordered

    

}
