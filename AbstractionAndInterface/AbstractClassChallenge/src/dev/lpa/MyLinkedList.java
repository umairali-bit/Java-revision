package dev.lpa;

public class MyLinkedList implements NodeList {

    protected ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    /*
    addItem(), takes a ListItem and returns true if it was added successfully or false otherwise.
    If the item is already present, it doesn't get added. Use compareTo() to place the item in its proper order.


    scenarios maybe if the list is empty then well make the new item as the head of list,
     */
    @Override
    public boolean addItem(ListItem newItem){

        if (this.root == null){

            //if the list is empty, new item will be the head of the list
            this.root = newItem;

            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {

            int comparison = (currentItem.compareTo(newItem));


            // if newItem is greater than currentItem, move right if possible
            if (comparison < 0){

                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    // if there is no next, then the new item belongs to the extreme right
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0){ // if newItem is less than currentItem, add the item before the current item

                //make the previous item's "next" refer to the new item, and the new item's "next" refer to the current item

                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {

                    // the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;



            } else {
                //if equal
                return false;
            }
        }


        return false;
    }

    @Override
    public boolean removeItem() {
        return false;
    }

   /*
   traverse(), takes the root as an argument and does not return anything. If the root is null it prints out:
   The list is empty, otherwise print each value on a separate line.
    */

    @Override
    public void traverse(ListItem root) {

        if (root == null) {
            System.out.println("This list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}