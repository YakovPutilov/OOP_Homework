package HumanTree;

import java.time.LocalDate;
import java.util.List;


public interface TreeItem  {
    
    String getFullName();
    
    LocalDate getbDate();
    
    List<String> getChildList();
}
