package Ch09_TheIterator_CompositePatterns;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
