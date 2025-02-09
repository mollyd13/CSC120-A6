/* This is a stub for the Cafe class */
/* Cafe class, extends the Building class */
public class Cafe extends Building{

    /* attributes for a cafe */
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /* cafe constructor */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 500;
        this.nSugarPackets = 50;
        this.nCreams = 44;
        this.nCups = 100;
    }

    /* removes the specified amount of coffee, sugars, creams, and a cup from the inventory and restocks when necessary*/
    public void sellCoffee(int size, int sugars, int creams){
        
        if (nCoffeeOunces <= size || nSugarPackets <= sugars || nCreams <= creams){
            restock(500, 50, 44, 100);
        }

        this.nCoffeeOunces -= size;
        this.nSugarPackets -= sugars;
        this.nCreams -= creams;
        this.nCups -= 1;
        System.out.println(size + " ounce coffee with " + sugars + " sugars and " + creams + " creams sold.");
    }

    /* adds more coffee, sugar packets, creams, and cups to the inventory */
    private void restock(int coffeeOuncesRestock, int sugarPacketsRestock, int creamsRestock, int cupsRestock){
        this.nCoffeeOunces += coffeeOuncesRestock;
        this.nSugarPackets += sugarPacketsRestock;
        this.nCreams += creamsRestock;
        this.nCups += cupsRestock;
        System.out.println("Inventory restocked.");
        
    }

    /* prints the inventory */
    public void printInventory(){
        System.out.println("Inventory: ");
        System.out.println(nCoffeeOunces + " ounces of coffee");
        System.out.println(nSugarPackets + " sugar packets");
        System.out.println(nCreams + " creams");
        System.out.println(nCups + " cups");
    }

    /* main method for testing */
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("cafe 1", "1234 st", 1);
        System.out.println(myCafe);
    }
    
}
