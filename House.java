/* This is a stub for the House class */
/* imports arraylist */
import java.util.ArrayList;

/* House class, extends from Building object */
public class House extends Building{

  /* attributes for a house */
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /* house constructor */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
  }

  /* returns whether or not the house has a dining room */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  /* returns the amount of residents in the building */
  public int nResidents(){
    return residents.size();
  }

  /* moves in a new resident */
  public void moveIn(String name){
    residents.add(name);
    System.out.println("Successfully moved in " + name);
  }

  /* moves out specified resident and returns their name */
  public String moveOut(String name){
    if (residents.contains(name)){
      residents.remove(name);
      System.out.println("Successfully moved out " + name);
    }
    else{
      System.err.println(name + " is not a resident");
    }
    return name;
  }

  /* returns whether or not a person is a resident of the house */
  public Boolean isResident(String person){
    if (residents.contains(person)){
      return true;
    }
    else {
      return false;
    }
  }

  /* main method for testing */
  public static void main(String[] args) {
    House myHouse = new House("house", "432 ave", 22, false);
    System.out.println(myHouse);
  }

}