package com.example.android.abndtourguideaustin;

/**
 * {@link PointOfInterest} represents a place that is worth seeing or visiting in the
 * author's opinion. It contains name, type of site, address, website, and local tips.
 */
public class PointOfInterest {

    /**
     * Name of the location
     */
    private String name;

    /**
     * Type of place, eatery, or business
     */
    private String category;

    /**
     * Physical location of the point of interest
     */
    private String address;

    /**
     * Web address for the location, if available
     */
    private String website;

    /**
     * Local tips about the location
     */
    private String localTips;

    /**
     * Resource ID for image associated with location
     */
    private int imageResourceID;

    /**
     * Constructs a new PointOfInterest object with a name, type, physical address, web address,
     * local tips, and image resource ID .
     *
     * @param nameRef  Name of location
     * @param catRef   Category reference for the location such as Asian or BBQ, if it's an eatery
     * @param addr     Physical address of the location
     * @param webURL   Web address of the location
     * @param loc_tips Advice, suggestion, and/or fun fact about the location
     * @param imageRId The resource ID of the image associated with the location
     */
    public PointOfInterest(String nameRef, String catRef, String addr, String webURL,
                           String loc_tips, int imageRId) {
        name = nameRef;
        category = catRef;
        address = addr;
        website = webURL;
        localTips = loc_tips;
        imageResourceID = imageRId;
    }

    /**
     * Gets the name of the location.
     *
     * @return Name to display
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type of the location.
     *
     * @return Type of place.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets the physical address of the location.
     *
     * @return physical address of the location
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the website address of the location
     *
     * @return website address of the location
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Gets the local knowledge about the place
     *
     * @return local knowledge about the point of interest
     */
    public String getLocalTips() {
        return localTips;
    }

    /**
     * Gets the resource ID of the image associated with the location
     *
     * @return resource ID of an image
     */
    public int getImageResourceID() {
        return imageResourceID;
    }
}
