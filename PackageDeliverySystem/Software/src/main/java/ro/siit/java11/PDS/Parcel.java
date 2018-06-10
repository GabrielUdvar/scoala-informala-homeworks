package ro.siit.java11.PDS;

/**
 * Parcel class defines the concept of a parcel/package. Each parcel needs to have sender and destination ContactInfo, trackingInfo and logisticalInfo.
 */
public class Parcel {
    private TrackingInfo trackinginfo;
    private LogisticalInfo logisticalInfo;
    private ContactInfo sender;
    private ContactInfo destination;

}
