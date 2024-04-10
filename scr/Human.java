import java.time.LocalDate;
import java.util.List;

public class Human {
    public String name;
    public String sName;
    public LocalDate bDate;
    public LocalDate dDate = null;
    public Sex sex;
    public Human mother;
    public Human father;
    public List<Human> childList;
    
    

    public Human(String name, String sName, LocalDate bDate, LocalDate dDate, Human mother, Human father,
            List<Human> childList) {
        this.name = name;
        this.sName = sName;
        this.bDate = bDate;
        this.dDate = dDate;
        this.mother = mother;
        this.father = father;
        this.childList = childList;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public void setFather(Human father){
        this.father = father;

    }
    public void setMother(Human mother){
        this.mother = mother;
        
    }
    // public void setSex(Sex sex) {
    //     this.sex = sex;
    // }
    public void setbDate(LocalDate bDate) {
        this.bDate = bDate;
    }
    public void setdDate(LocalDate dDate) {
        this.dDate = dDate;
    }
    public String getName() {
        return name;
    }
    public Sex getSex() {
        return sex;
    }
    public LocalDate getbDate() {
        return bDate;
    }
    public LocalDate getdDate() {
        return dDate;
    }
    public String getsName() {
        return sName;
    }
    public Human getMother() {
        return mother;
    }
    public Human getFather() {
        return father;
    }
    public List<Human> getChildList() {
        return childList;
    }
  
}
