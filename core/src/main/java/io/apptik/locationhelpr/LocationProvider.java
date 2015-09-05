package io.apptik.locationhelpr;

import android.location.Location;
import android.os.Looper;

public interface LocationProvider {

    abstract Location getLastLocation();
    abstract boolean isLocationAvailable();
    abstract void removeLocationUpdates(LocationListener listener);
    abstract void requestLocationUpdates(LocationRequest request, LocationListener listener, Looper looper);
    abstract void requestLocationUpdates(LocationRequest request, LocationListener listener);


}
