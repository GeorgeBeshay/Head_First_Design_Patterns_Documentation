package Ch09_TheIterator_CompositePatterns;

public class WaitressPro {
    MenuComponent allMenus;

    public WaitressPro(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
