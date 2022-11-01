/* This is a stub for the Library class */
/* import hashtable and set */
import java.util.Hashtable;
import java.util.Set;

/* Library class, extends from Building class */
public class Library extends Building{

  /* attribute for library */
  private Hashtable<String, Boolean> collection;

    /* library constructor */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
    }

    /* adds a book to the collection */
    public void addTitle(String title){
      collection.put(title, true);
      System.out.println("Successfully added " + title + " to the collection");
    }

    /* removes a book from the collection and returns the title */
    public String removeTitle(String title){
      if (collection.containsKey(title)){
        collection.remove(title);
        System.out.println(title + " has been removed from the collection");
      }
      else{
        System.err.println(title + " is not in the collection so it cannot be removed");
      }
      return title;
    }

    /* changes the value of a title in the collection from true to false */
    public void checkOut(String title){
      if (collection.containsKey(title)){

        if (collection.get(title)){
          collection.replace(title, true, false);
          System.out.println("Successfully checked out " + title);
        }
        else {
          System.err.println(title + " has already been checked out");
        }
      }
      else {
        System.err.println(title + " is not in the collection");
      }

    }

    /* changes the value of a title in the collection from false to true */
    public void returnBook(String title){
      collection.replace(title, false, true);
    }

    /* returns whether or not a book is in the collection */
    public boolean containsTitle(String title){
      return collection.containsKey(title);
    }

    /* returns whether or not a book is available to be checked out */
    public boolean isAvailable(String title){
      return collection.get(title);
    }

    /* prints the books in the collection and their availability */
    public void printCollection(){
      Set<String> keys = collection.keySet();
      for(String key: keys){
        System.out.println("Availabilty of "+key+" is: "+collection.get(key));
    }
    }
    
    /* main method for testing */
    public static void main(String[] args) {
      Library myLibrary = new Library("library", "123 st", 4);
      System.out.println(myLibrary);
      myLibrary.addTitle("book 1");
      myLibrary.addTitle("book 2");
      myLibrary.addTitle("book 3");
      myLibrary.checkOut("book 2");
      myLibrary.printCollection();
    }
  
  }