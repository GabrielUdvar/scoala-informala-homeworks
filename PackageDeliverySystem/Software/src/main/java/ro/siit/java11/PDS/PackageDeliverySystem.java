package ro.siit.java11.PDS;
/**
 *
 */

public class PackageDeliverySystem {

    private Parcel parcels[];

    /**
     *
     * @param pickupContactInfo: required contact information for the pick-up address of the parcel
     * @param deliveryContactInfo: required contact information for the delivery address of the parcel
     * @return
     */
    public  String requestDeliveryPickup(ContactInfo pickupContactInfo, ContactInfo deliveryContactInfo){
        return null;
    }

    /**
     *
     * @param trackingID
     * @return
     */
    public TrackingInfo getTrackingInfo(String trackingID){
        return null;
    }

    /**
     *
     * @param admin
     * @return
     */
    public Parcel[] getParcels(Administrator admin){
        return null;
    }

}
