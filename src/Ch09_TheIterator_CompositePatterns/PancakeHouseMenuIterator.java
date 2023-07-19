package Ch09_TheIterator_CompositePatterns;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{

    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public MenuItem next() {
        if(position >= items.size()){
            System.out.println("No More Items !!");
            return null;
        }
        return items.get(position++);
    }
}
