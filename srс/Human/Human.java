package Human;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import HumanTree.TreeItem;

public class Human implements Serializable, Comparable<Human>, TreeItem  {
    private String name;
    private String sName;
    private LocalDate bDate;
    private LocalDate dDate = null;
    private Sex sex;
    private Human mother;
    private Human father;
    private List<String> childList;
    
    

    public Human(String name, String sName, Sex sex, LocalDate bDate) {
        this.name = name;
        this.sName = sName;
        this.sex = sex;
        this.bDate = bDate;
        // this.dDate = dDate;
        // this.mother = mother;
        // this.father = father;
        // this.childList = childList;
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
    public List<String> getChildList() {
        return childList;
    }
    public String getFullName(){
        return this.name + " " + this.sName;
    }

    public void addChild(Human child){
        if (childList == null){
            childList = new ArrayList<>();
        }
        childList.add(child.getFullName());
    }

    
    

    @Override
    public String toString() {
        
        return "Human [Name=" + name 
                + ", Surname=" + sName 
                + ", Sex=" + sex
                + ", Burth Date=" + bDate + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Human human) {
            return human.getFullName()==getFullName();
        }
        return false;
    }
    @Override
    public int compareTo(Human o) {

        return this.getFullName().compareTo(o.getFullName());
        
    }
  
}
