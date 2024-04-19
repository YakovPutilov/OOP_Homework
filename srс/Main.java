import java.time.LocalDate;

import Filewriter.Filewriter;
import Human.Human;
import Human.Sex;
import HumanTree.HumanTree;

public class Main {
    public static void main(String[] args) {
    
        HumanTree<Human> newTree = new HumanTree<>("Putilov");
        Human yakov = new Human("Yakov", "Putilov", Sex.Male, LocalDate.of(1988, 7, 20));        
        newTree.addHuman(yakov);
        Human yury = new Human("Yury", "Putilov", Sex.Male, LocalDate.of(2017, 10, 23));        
        newTree.addHuman(yury);
        Human stepan = new Human("Stepan", "Putilov", Sex.Male, LocalDate.of(2019, 4, 14));        
        newTree.addHuman(stepan);
        yakov.addChild(stepan);
        yakov.addChild(yury);
            // Filewriter newFilewriter = new Filewriter();
            // newFilewriter.save( newTree, "newTree.txt");
        
        System.out.println(newTree);
        System.out.println(yakov.getChildList());



        
    }

    // static void save(HumanTree humanTree, String fileAdr){
    //     Filewriter filewriter = new Filewriter();

    //     
    //     filewriter.save(humanTree, fileAdr);

    // }
    
}
    