package io.apptik.locationhelpr;


public class LocationRequest {

    /**
     * Used with setPriority(int) to request the most accurate locations available.
     * This will return the finest location available.
     */
    public static final int PRIORITY_HIGH_ACCURACY = 0;
    /**
     * Used with setPriority(int) to request "block" level accuracy.
     * Block level accuracy is considered to be about 100 meter accuracy. Using a coarse accuracy such as this often consumes less power.
     */
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 1;
    /**
     * Used with setPriority(int) to request "city" level accuracy.

     City level accuracy is considered to be about 10km accuracy. Using a coarse accuracy such as this often consumes less power.
     */
    public static final int PRIORITY_LOW_POWER = 2;

    /**
     * Used with setPriority(int) to request the best accuracy possible with zero additional power consumption.

     No locations will be returned unless a different client has requested location updates in which case this request will act as a passive listener to those locations.
     */
    public static final int PRIORITY_NO_POWER = 3;
    private long mExpirationTime;
    private long mFastestInterval;
    private long mInterval;
    private long mMaxWaitTime;
    private int mNumUpdates;
    private int mPriority;
    private float mSmallestDisplacement;


    public long getExpirationTime(){
        return mExpirationTime;
    }
    public long getFastestInterval(){
        return mFastestInterval;
    }
    public long getInterval(){
        return mInterval;
    }
    public long getMaxWaitTime(){
        return mMaxWaitTime;
    }
    public int getNumUpdates(){
        return mNumUpdates;
    }
    public int getPriority(){
        return mPriority;
    }
    public float getSmallestDisplacement(){
        return mSmallestDisplacement;
    }

    public LocationRequest withExpirationDuration(long millis){

        return this;
    }
    public LocationRequest withExpirationTime(long millis){
        return this;
    }
    public LocationRequest withFastestInterval(long millis){
        return this;
    }
    public LocationRequest withInterval(long millis){
        return this;
    }
    public LocationRequest withMaxWaitTime(long millis){
        return this;
    }
    public LocationRequest withNumUpdates(int numUpdates){
        return this;
    }
    public LocationRequest withPriority(int priority){
        return this;
    }
    public LocationRequest withSmallestDisplacement(float smallestDisplacementMeters){
        return this;
    }


}
