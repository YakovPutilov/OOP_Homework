package HumanTree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Human.Human;
import Human.HumanIterator;

public class HumanTree implements Serializable, Iterable<Human>{

    private String sName;
    private List<Human> humans;
    
    public HumanTree(String sName) {
        this.sName = sName;
        humans = new ArrayList<>();
        
    }
    public String getSName(){
        return sName;
    }
    public List<Human> getHumans() {
        return humans;
    }


    public void addHuman(Human human){
        humans.add(human);
       
    }

    public StringBuilder findChildren(Human parent){
        StringBuilder stringBuilder = new StringBuilder();

        for (Human human : humans){
            for (Human child : parent.getChildList()) {
                if (child.equals(human)) {
                    stringBuilder.append(human.getName());
                }
            }
            
        }
    return stringBuilder;
    }

    public List<Human> sortByName(HumanTree startTree){
        List<Human> humanList = startTree.getHumans();     
        humanList.sort(new HumanComparatorByName());
        return humanList;
    }

    public List<Human> sortByAge(HumanTree startTree){
        List<Human> humanList = startTree.getHumans();     
        humanList.sort(new HumanComparatorByAge());
        return humanList;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(sName);
        sBuilder.append("'s:\n");
        for (Human human : humans) {
            
            sBuilder.append(human);
            sBuilder.append("\n");

        }
        return sBuilder.toString();
    }
    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(humans);
    }
}
