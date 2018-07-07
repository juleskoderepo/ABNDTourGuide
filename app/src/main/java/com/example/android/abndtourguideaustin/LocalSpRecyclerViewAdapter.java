package com.example.android.abndtourguideaustin;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class LocalSpRecyclerViewAdapter extends
        RecyclerView.Adapter<LocalSpRecyclerViewAdapter.LocalSpViewHolder> {
    private ArrayList<LocalSpeak> LocalSpList;

    public static class LocalSpViewHolder extends RecyclerView.ViewHolder {
        TextView commonTV;
        TextView localTV;

        public LocalSpViewHolder(View itemView) {
            super(itemView);

            commonTV = itemView.findViewById(R.id.common);
            localTV = itemView.findViewById(R.id.localsp);
        }

    }

    /**
     * Provide a suitable constructor. Custom constructor for a new LocalSpeak object.
     * Use context to inflate the layout file and the list is the data we want to populate
     * into the lists.
     *
     * @param localSpeak an array list of local speak.
     */

    public LocalSpRecyclerViewAdapter(ArrayList<LocalSpeak> localSpeak) {
        LocalSpList = localSpeak;
    }

    @Override
    public int getItemCount() {
        return LocalSpList.size();
    }

    @NonNull
    @Override
    public LocalSpRecyclerViewAdapter.LocalSpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItemView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.localspeak_item, parent, false);
        return new LocalSpViewHolder(listItemView);

    }

    @Override
    public void onBindViewHolder(@NonNull LocalSpRecyclerViewAdapter.LocalSpViewHolder holder, int position) {
        LocalSpeak currentPoint = LocalSpList.get(position);

        holder.commonTV.setText(currentPoint.getCommonSpeak());
        holder.localTV.setText(currentPoint.getLocalSpeak());

    }
}