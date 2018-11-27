package Attractions;

public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String attractionName) {
        super(attractionName);
    }

    public boolean isAllowed(Visitor visitor) {
        if (visitor.getHeight() >= 145)
            return true;
        else {
            return false;
        }
    }


}
