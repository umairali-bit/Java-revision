package dev.lpa;

public abstract class ListItem {

    /*
    It has three protected fields. Two ListItems called rightLink and leftLink, and an Object called value.
     */

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    /*
     A constructor that takes an Object and initialises the field value with the parameter that was passed in.
     */

    public ListItem(Object value) {
        this.value = value;
    }

    /*
    And seven methods:

        next(), setNext(), previous(), setPrevious() and compareTo()
        which are package-private and abstract (see child class for declaration).
     */

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);




    public ListItem getRightLink() {
        return rightLink;
    }

    public ListItem setRightLink(ListItem rightLink) {
        return this.rightLink = rightLink;
    }

    public ListItem getLeftLink() {
        return leftLink;
    }

    public ListItem setLeftLink(ListItem leftLink) {
        return this.leftLink = leftLink;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

}
