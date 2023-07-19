package Ch09_TheIterator_CompositePatterns;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Diner - Name 1", "Description 1", true, 100);
        addItem("Diner - Name 2", "Description 2", false, 200);
        addItem("Diner - Name 3", "Description 3", true, 300);
        addItem("Diner - Name 4", "Description 4", false, 400);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, menu is full .. Can't add more items to the menu.");
            return;
        }
        menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
        numberOfItems++;
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
