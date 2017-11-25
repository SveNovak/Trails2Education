package eu.trails2education.trails.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import eu.trails2education.trails.R;
import eu.trails2education.trails.path.InterestPoint;

/**
 * Created by Žiga on 25. 11. 2017.
 */

public class MyMarker {

    public MarkerOptions marker;
    public InterestPoint interestPoint;

    public MyMarker(Context context, InterestPoint interestPoint){
        this.interestPoint = interestPoint;

        LatLng latLng = new LatLng(interestPoint.coordinate.lat, interestPoint.coordinate.lon);

        BitmapDrawable bitmapdraw=(BitmapDrawable)context.getResources().getDrawable(R.drawable.interest_point_castle);
        Bitmap b=bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b, 100, 100, false);
        marker = new MarkerOptions().position(latLng).title("Test Marker").icon(BitmapDescriptorFactory.fromBitmap(smallMarker));
    }

}
