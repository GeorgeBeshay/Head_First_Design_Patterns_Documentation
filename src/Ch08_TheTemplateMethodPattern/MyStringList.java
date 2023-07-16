package Ch08_TheTemplateMethodPattern;

import java.util.AbstractList;
import java.util.List;

public class MyStringList extends AbstractList {

    private String[] myList;

    public MyStringList(String[] strings){
        myList = strings;
    }

    @Override
    public Object get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public String set(int index, String item){
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }

    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(ducks);
        List ducksSubList = ducksList.subList(2, 3);
        System.out.println(ducksSubList);
    }
}
