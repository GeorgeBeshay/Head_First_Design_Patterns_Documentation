package Ch09_TheIterator_CompositePatterns;

public class MenuTestDrive {
    public static void main(String[] args) {
//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        DinerMenu dinerMenu = new DinerMenu();
//        CafeMenu cafeMenu = new CafeMenu();
//
//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
//
//        waitress.printMenu();

        // After applying the composite pattern
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Diner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course ..");

        MenuComponent allMenus = new Menu("ALL MENUs", "All menus combined");

        pancakeHouseMenu.add(new MenuItem("Pancake House Menu item 1", "Pancake House Menu item 1 - description", true, 2));
        dinerMenu.add(new MenuItem("Diner Menu item 1", "Diner Menu item 1 - description", false, 2));
        dinerMenu.add(dessertMenu);
        cafeMenu.add(new MenuItem("Cafe Menu item 1", "Cafe Menu item 1 - description", true, 3));
        dessertMenu.add(new MenuItem("Dessert Menu item 1", "Dessert Menu item 1 - description", false, 4));

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        WaitressPro waitressPro = new WaitressPro(allMenus);
        waitressPro.printMenu();

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);


    }
}
