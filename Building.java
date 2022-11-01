/* Building class */
public class Building {

    /*attributes for Building */
    private String name = "<Name Unknown>";
    private String address = "<Address Unknown>";
    private int nFloors = 1;

    /* building constructor */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }
    /* returns the name of the building */
    public String getName() {
        return this.name;
    }
    /* returns the address of the building */
    public String getAddress() {
        return this.address;
    }
    /* returns the num of floors of the building */
    public int getFloors() {
        return this.nFloors;
    }
    /* clearly describes the building in string format */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }
    /* main method for testing */
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}