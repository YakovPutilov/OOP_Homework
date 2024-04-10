
import java.util.ArrayList;
import java.util.List;

public class HumanTree {

    String sName;
    List<Human> humans;
    
    public HumanTree(String sName) {
        this.sName = sName;
        humans = new ArrayList<>();
        
    }
    public void addHuman(Human human){
        if (human.sex.equals("Female")){
            human = new Women();
        }
        if (human.sex.equals("Male")){
            human = new Men();
        }
        
        
    }

    public StringBuilder findChildren(Human parent){
        StringBuilder stringBuilder = new StringBuilder();

        for (Human human : humans){
            for (Human child : parent.childList) {
                if (child.equals(human)) {
                    stringBuilder.append(human.getName());
                }
            }
            
        }
    return stringBuilder;
    }
}
