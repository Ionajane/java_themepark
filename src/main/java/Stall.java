public abstract class Stall {

    protected String name;
    protected String ownerName;
    protected int parkingSpot;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }
}
