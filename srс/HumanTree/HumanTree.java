package HumanTree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Human.HumanIterator;

public class HumanTree<E extends TreeItem> implements Serializable, Iterable<E>{

    private String sName;
    private List<E> humans;
    
    public HumanTree(String sName) {
        this.sName = sName;
        humans = new ArrayList<>();
        
    }
    public String getSName(){
        return sName;
    }
    public List<E> getHumans() {
        return humans;
    }


    public void addHuman(E human){
        humans.add(human);
       
    }

    public StringBuilder findChildren(E parent){
        StringBuilder stringBuilder = new StringBuilder();

        for (E human : humans){
            for (String child : parent.getChildList()) {
                if (child.equals(human.getFullName())) {
                    stringBuilder.append(human.getFullName());
                }
            }
            
        }
    return stringBuilder;
    }

    public List<E> sortByName(HumanTree<E> startTree){
        List<E> humanList = startTree.getHumans();     
        humanList.sort(new HumanComparatorByName<E>());
        return humanList;
    }

    public List<E> sortByAge(HumanTree<E> startTree){
        List<E> humanList = startTree.getHumans();     
        humanList.sort(new HumanComparatorByAge<E>());
        return humanList;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(sName);
        sBuilder.append("'s:\n");
        for (E human : humans) {
            
            sBuilder.append(human);
            sBuilder.append("\n");

        }
        return sBuilder.toString();
    }
    @Override
    public Iterator<E> iterator() {
        return new HumanIterator<E>(humans);
    }
}
