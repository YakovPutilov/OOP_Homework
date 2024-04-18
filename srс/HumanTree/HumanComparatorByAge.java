package HumanTree;


import java.util.Comparator;

import Human.Human;

public class HumanComparatorByAge implements Comparator<Human> {
    

    @Override
    public int compare(Human o1, Human o2) {
        
       
        return o1.getbDate().compareTo(o2.getbDate());
    }
}
