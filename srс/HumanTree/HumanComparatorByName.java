package HumanTree;

import java.util.Comparator;



public class HumanComparatorByName<E extends TreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
