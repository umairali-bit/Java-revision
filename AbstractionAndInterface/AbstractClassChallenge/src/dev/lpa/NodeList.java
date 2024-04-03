package dev.lpa;

/*
NodeList (interface)

    -  It has four methods:

        -  getRoot(), addItem(), removeItem() and traverse() which are package-private and abstract (see child class for declaration).


 */

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem item);



}