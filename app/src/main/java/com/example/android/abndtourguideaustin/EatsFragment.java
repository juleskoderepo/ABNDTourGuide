package com.example.android.abndtourguideaustin;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class EatsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rVAdapter;
    private RecyclerView.LayoutManager rVLayoutManager;

    public EatsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list,container,false);

        // Create an array list of pointsOfInterest and populate
        ArrayList<PointOfInterest> pointsOfInterest = new ArrayList<>();

        pointsOfInterest.add(new PointOfInterest("Santorini Cafe","Greek","North Austin",
                "https://www.facebook.com/Santorini-Cafe-Austin-TX-186609728147903/",
                "Great outdoor space for kiddos and dogs. Go for the $2.50 sangria during Happy Hour!"));
        pointsOfInterest.add(new PointOfInterest("Torchy's Tacos","Tex-mex","Multiple locations",
                "https://torchystacos.com/","Secret menu"));
        pointsOfInterest.add(new PointOfInterest("Baguette House","Vietnamese","North Austin",
                "http://www.baguettehouseaustin.com/","Get veggies separate for to-go orders."));

        recyclerView = rootView.findViewById(R.id.guide_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        rVLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(rVLayoutManager);

        //specify an adapter
        rVAdapter = new POIRecyclerViewAdapter(pointsOfInterest);
        recyclerView.setAdapter(rVAdapter);

        return rootView;
    }

}
