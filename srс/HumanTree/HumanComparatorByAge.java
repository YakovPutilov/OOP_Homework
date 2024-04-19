package HumanTree;


import java.util.Comparator;



public class HumanComparatorByAge<E extends TreeItem> implements Comparator<E> {
    

    @Override
    public int compare(E o1, E o2) {
        
       
        return o1.getbDate().compareTo(o2.getbDate());
    }
}
