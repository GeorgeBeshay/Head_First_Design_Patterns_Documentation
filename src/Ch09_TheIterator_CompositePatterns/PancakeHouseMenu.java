package Ch09_TheIterator_CompositePatterns;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem("Pancake House - Name 1", "Description 1", true, 100);
        addItem("Pancake House - Name 2", "Description 2", false, 200);
        addItem("Pancake House - Name 3", "Description 3", true, 300);
        addItem("Pancake House - Name 4", "Description 4", false, 400);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }
}
