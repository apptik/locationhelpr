package io.apptik.locationhelpr.google;


import android.location.Location;
import android.os.Looper;

import io.apptik.locationhelpr.LocationListener;
import io.apptik.locationhelpr.LocationProvider;
import io.apptik.locationhelpr.LocationRequest;

public class FusedLocationProvider implements LocationProvider {
    @Override
    public Location getLastLocation() {
        return null;
    }

    @Override
    public boolean isLocationAvailable() {
        return false;
    }

    @Override
    public void removeLocationUpdates(LocationListener listener) {

    }

    @Override
    public void requestLocationUpdates(LocationRequest request, LocationListener listener, Looper looper) {

    }

    @Override
    public void requestLocationUpdates(LocationRequest request, LocationListener listener) {

    }
}
