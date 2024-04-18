package Filewriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Filewriter implements Writable{
   
    public boolean save(Serializable serializable, String fileAdr) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileAdr))) {
            objectOutputStream.writeObject(serializable);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
       
    }

    public Object read (String fileAdr){
        
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileAdr))){
            return objectInputStream;
       
        } catch (IOException e) {
            
            e.printStackTrace();
            return null;
        }

        

    }

}
