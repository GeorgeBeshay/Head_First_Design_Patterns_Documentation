package Ch12_CompoundPatterns;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
