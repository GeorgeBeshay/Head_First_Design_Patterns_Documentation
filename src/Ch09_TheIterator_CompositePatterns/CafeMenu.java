package Ch09_TheIterator_CompositePatterns;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu_IF {
    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu(){
        addItem("Cafe Menu - Name 1", "Description 1", true, 100);
        addItem("Cafe Menu - Name 2", "Description 2", false, 200);
        addItem("Cafe Menu - Name 3", "Description 3", true, 300);
        addItem("Cafe Menu - Name 4", "Description 4", false, 400);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
