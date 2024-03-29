package dev.lpa;
/*
Node (concrete class)

    -  It extends ListItem.
 */

public class Node extends ListItem{

     /*
    It has a constructor that takes an Object, then calls its parent constructor with the parameter that was passed in.
     */

    public Node(Object value) {
        super(value);
    }

    /*
    five methods which are package-private:

        -  next(), takes no parameters and returns the ListItem to its right.

        -  setNext(), takes a ListItem and sets it as its rightLink, then it returns rightLink.

        -  previous(), takes no parameters and returns the ListItem to its left.

        -  setPrevious(), takes a ListItem and sets it as its leftLink, then it returns leftLink.
     */

    @Override
    ListItem next() {
        return getRightLink();
    }

    @Override
    ListItem setNext(ListItem item) {
     return setRightLink(rightLink);

    }

    @Override
    ListItem previous() {
        return getLeftLink();
    }

    @Override
    ListItem setPrevious(ListItem item) {
       return setLeftLink(leftLink);
    }

    /*
    compareTo(), takes a ListItem and compares it to the ListItem that called this method.
        Use value from ListItem for comparison. If this value is greater than the value that was passed in,
        then it should return a number greater than zero. If vice versa, then it should return a number less than zero,
         and zero if equal.
     */

    @Override


    int compareTo(ListItem item) {
        //if compare result is same, return 0
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }

    }


}
