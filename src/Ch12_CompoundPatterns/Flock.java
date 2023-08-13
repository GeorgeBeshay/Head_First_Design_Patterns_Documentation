package Ch12_CompoundPatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{
    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable){
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while(iterator.hasNext())
            (iterator.next()).quack();
    }

    @Override
    public void registerObserver(Observer observer) {
        for(Quackable quackable : quackers)
            quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        for(Quackable quackable : quackers)
            quackable.notifyObservers();
    }
}
