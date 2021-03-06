package ca.bcit.comp1510.ch13;

/**
 * Driver to exercise the MagazineList collection.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class MagazineRack {

    /**
     * Creates a MagazineList object, adds several magazines to the list, then
     * prints it.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        MagazineList rack = new MagazineList();

        rack.add(new Magazine("Time"));
        rack.add(new Magazine("Woodworking Today"));
        rack.add(new Magazine("Communications of the ACM"));
        rack.add(new Magazine("House and Garden"));
        rack.add(new Magazine("GQ"));

        System.out.println(rack);
    }
}

