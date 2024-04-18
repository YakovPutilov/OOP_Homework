package Filewriter;
import java.io.Serializable;

public interface Writable {

    boolean save (Serializable serializable, String fileAdr);

    Object read (String fileAdr);
    
}