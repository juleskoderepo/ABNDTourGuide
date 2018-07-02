package com.example.android.abndtourguideaustin;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class POIArrayAdapter extends ArrayAdapter<PointOfInterest> {

    /**
     * Custom constructor for a new PointOfInteret object.
     * Use context to inflate the layout file and the list is the data we want to populate
     * into the lists.
     *
     * @param context Current context used to inflate the layout file.
     * @param pointsOfInterest locations to visit
     */
    public POIArrayAdapter(Activity context, ArrayList<PointOfInterest> pointsOfInterest){
        super(context, 0, pointsOfInterest);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.ptofinterest_item, parent, false);
        }

        // Get the {@link PointOfIntenter} object located at this position in the list
        PointOfInterest currentPoint = getItem(position);

        // Find the TextView with ID name_reference and set the text from the current item
        TextView nameTV = listItemView.findViewById(R.id.name);
        nameTV.setText(currentPoint.getName());

        // Find the TextView with ID type_reference and set the text from the current item
        TextView categoryTV = listItemView.findViewById(R.id.category);
        categoryTV.setText(currentPoint.getCategory());

        // Find the TextView with ID address and set the text from the current item
        TextView addressTV = listItemView.findViewById(R.id.address);
        addressTV.setText(currentPoint.getAddress());

        // Find the TextView with ID website and set the text from the current item
        TextView websiteTV = listItemView.findViewById(R.id.website);
        websiteTV.setText(currentPoint.getWebsite());

        // Find the TextView with ID local_tip and set the text from the current item
        TextView localTipTV = listItemView.findViewById(R.id.local_tip);
        localTipTV.setText(currentPoint.getLocalTips());

        // Return the whole list item layout so that it can be displayed in the RecyclerView
        return listItemView;
    }
}

