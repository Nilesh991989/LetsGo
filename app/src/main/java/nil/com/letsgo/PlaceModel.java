package nil.com.letsgo;

import android.location.Location;
import android.widget.TextView;

public class PlaceModel {
    private String locationText;
    private Double mLatitude;
    private Double mLongitude;

    public Double getmLatitude() {
        return mLatitude;
    }

    public Double getmLongitude() {
        return mLongitude;
    }

    public String getLocationText() {
        return locationText;
    }

    public void setmLatitude(Double mLatitude) {
        this.mLatitude = mLatitude;
    }

    public void setmLongitude(Double mLongitude) {
        this.mLongitude = mLongitude;
    }

    public void setLocationText(String locationText) {
        this.locationText = locationText;
    }
}
