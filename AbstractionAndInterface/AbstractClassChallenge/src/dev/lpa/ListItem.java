package dev.lpa;

//ListItem (abstract class)
public abstract class ListItem {

    //three protected fields. Two ListItems called rightLink and leftLink, and an Object called value.

    protected ListItem rightLink;
    protected ListItem leftLink;

    protected Object value;

    //A constructor that takes an Object and initialises the field value with the parameter that was passed in.
    public ListItem(Object value) {
        this.value = value;
    }

    /*
    seven methods:

    next(), setNext(), previous(), setPrevious() and compareTo() which are package-private and abstract (see child class for declaration).

    getValue(), takes no parameters and returns its value.

    setValue(), takes an Object and assigns it to value.
     */

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}