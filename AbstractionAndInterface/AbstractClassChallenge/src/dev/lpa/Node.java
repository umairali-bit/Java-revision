package dev.lpa;

//Node (concrete class) It extends ListItem.
public class Node extends ListItem {


//It has a constructor that takes an Object, then calls its parent constructor with the parameter that was passed in.
    public Node(Object value) {
        super(value);
    }


//five methods which are package-private

    // next(), takes no parameters and returns the ListItem to its right
    @Override
    ListItem next() {
        return this.rightLink;
    }

    //setNext(), takes a ListItem and sets it as its rightLink, then it returns rightLink.
    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return rightLink;
    }


    // previous(), takes no parameters and returns the ListItem to its left.
    @Override
    ListItem previous() {
        return this.leftLink;
    }


    //setPrevious(), takes a ListItem and sets it as its leftLink, then it returns leftLink
    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return leftLink;
    }

    //compareTo(), takes a ListItem and compares it to the ListItem that called this method. Use value from ListItem for comparison.
    // If this value is greater than the value that was passed in, then it should return a number greater than zero.
    // If vice versa, then it should return a number less than zero, and zero if equal.

    @Override
    int compareTo(ListItem item) {

        if (item != null){
            return ((String)super.getValue()).compareTo((String)item.getValue());

        } else{
            return -1;
        }

    }
}
