package Attractions;

public abstract class Attraction {

    protected String attractionName;

    public Attraction(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getAttractionName() {
        return attractionName;
    }
}
