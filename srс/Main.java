import java.time.LocalDate;

import Filewriter.Filewriter;
import Human.Human;
import Human.Sex;
import HumanTree.HumanTree;

public class Main {
    public static void main(String[] args) {
    
        HumanTree newTree = new HumanTree("Putilov");
        Human yakov = new Human("Yakov", "Putilov", Sex.Male, LocalDate.of(1988, 7, 20));        
        newTree.addHuman(yakov);
        System.out.println(newTree);
        Filewriter newFilewriter = new Filewriter();
        newFilewriter.save( newTree, "newTree.txt");
    }

    // static void save(HumanTree humanTree, String fileAdr){
    //     Filewriter filewriter = new Filewriter();

    //     // На семинаре показали такой метод, однако осталось недосказанным, 
    //     // должен ли быть класс HumanTree Serialasable или writable. 
    //     // Не понял где мы привязываем класс дерева к нужному интерфейсу
    //     filewriter.save(humanTree, fileAdr);

    // }
    
}
    