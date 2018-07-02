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
 */
public class SightsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rVAdapter;
    private RecyclerView.LayoutManager rVLayoutManager;


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list,container,false);

        // Create an array list of pointsOfInterest and populate
        ArrayList<PointOfInterest> pointsOfInterest = new ArrayList<>();

        pointsOfInterest.add(new PointOfInterest("Texas Capitol","Historic/Government","Central Austin",
                "https://tspb.texas.gov/prop/tc/tc/capitol.html",
                "Guided and self-guided tours available."));
        pointsOfInterest.add(new PointOfInterest("The Bullock Texas State History Museum","Historic/Museum","Central Austin",
                "https://tspb.texas.gov/prop/tshm/tshm/tshm.html","Take in a show at the IMAX theater"));
        pointsOfInterest.add(new PointOfInterest("Graffiti Park at Castle Hill","Art","Central Austin",
                "http://hopecampaign.org/hopeprojects/hope-outdoor-gallery/","Go soon. Getting demolished for condos. Relocating to Carson Creek Ranch in east Austin."));

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
