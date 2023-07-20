package Ch09_TheIterator_CompositePatterns;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        if(position >= items.length){
            System.out.println("No More Items !!");
            return null;
        }
        return items[position++];
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items.");
    }
}
