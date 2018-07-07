package com.example.android.abndtourguideaustin;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class POIRecyclerViewAdapter extends RecyclerView.Adapter<POIRecyclerViewAdapter.POIViewHolder> {
    private ArrayList<PointOfInterest> PointsList;

    public static class POIViewHolder extends RecyclerView.ViewHolder {
        TextView nameTV;
        TextView categoryTV;
        TextView addressTV;
        TextView websiteTV;
        TextView localTipTV;
        ImageView imageView;

        public POIViewHolder(View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.name);
            categoryTV = itemView.findViewById(R.id.category);
            addressTV = itemView.findViewById(R.id.address);
            websiteTV = itemView.findViewById(R.id.website);
            localTipTV = itemView.findViewById(R.id.local_tip);
            imageView = itemView.findViewById(R.id.location_image);
        }

    }

    /**
     * Provide a suitable constructor. Custom constructor for a new PointOfInterest object.
     * Use context to inflate the layout file and the list is the data we want to populate
     * into the lists.
     *
     * @param pointsOfInterest an array list of points of interest.
     */
    public POIRecyclerViewAdapter(ArrayList<PointOfInterest> pointsOfInterest) {
        PointsList = pointsOfInterest;
    }

    @Override
    public int getItemCount() {
        return PointsList.size();
    }

    @NonNull
    @Override
    public POIRecyclerViewAdapter.POIViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItemView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.ptofinterest_item, parent, false);
        return new POIViewHolder(listItemView);

    }

    @Override
    public void onBindViewHolder(@NonNull POIRecyclerViewAdapter.POIViewHolder holder, int position) {
        PointOfInterest currentPoint = PointsList.get(position);

        holder.nameTV.setText(currentPoint.getName());
        holder.categoryTV.setText(currentPoint.getCategory());
        holder.addressTV.setText(currentPoint.getAddress());
        holder.websiteTV.setText(currentPoint.getWebsite());
        holder.localTipTV.setText(currentPoint.getLocalTips());
        holder.imageView.setImageResource(currentPoint.getImageResourceID());

    }
}