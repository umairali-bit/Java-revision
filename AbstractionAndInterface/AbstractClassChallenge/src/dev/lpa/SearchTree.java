package dev.lpa;

public class SearchTree implements NodeList{

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            // This list was empty
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0){
                // newItem is greater than current item in Alphabetical order
                if(currentItem.next() != null){
                    // move to the right if possible
                    currentItem = currentItem.next();
                } else {
                    // there is no next, just insert new item to right
                    currentItem.setNext(newItem);
                    // and set previous pointer
                    // if don't set previous, current item will reset to null;
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }
            else if (comparison > 0){
                // newItem is smaller than current item in Alphabetical order
                // we already move to correct position, insert new item to left
                if(currentItem.previous() != null) {
                    // Need to reset previous and next pointer to correct item
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setNext(newItem);
                } else {
                    // current item is root and had no previous item
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    // reset new item to root
                    this.root = newItem;

                }
                return true;

            }
            else {
                // find the same item in the list
                System.out.println(newItem.getValue() + " was already in the list");
                return false;
            }
        }
        System.out.println("Error adding new item function");
        return false;


    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
