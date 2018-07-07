package com.example.android.abndtourguideaustin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create an array list of pointsOfInterest and populate
        ArrayList<PointOfInterest> pointsOfInterest = new ArrayList<>();

        pointsOfInterest.add(new PointOfInterest(getString(R.string.sights_txcap),
                getString(R.string.sights_txcap_cat), getString(R.string.sights_txcap_addr),
                getString(R.string.sights_txcap_web),
                getString(R.string.sights_txcap_tip),
                R.drawable.texas_state_capitol_bldg));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.sights_bullock),
                getString(R.string.sights_bullock_cat), getString(R.string.sights_bullock_addr),
                getString(R.string.sights_bullock_web), getString(R.string.sights_bullock_tip),
                R.drawable.texas_state_history_museum));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.sights_esbmacc),
                getString(R.string.sights_esbmacc_cat), getString(R.string.sights_esbmacc_addr),
                getString(R.string.sights_esbmacc_web), getString(R.string.sights_esbmacc_tip),
                R.drawable.esb_macc));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.sights_graffiti_park),
                getString(R.string.sights_graffiti_park_cat),
                getString(R.string.sights_graffiti_park_addr),
                getString(R.string.sights_graffiti_park_web),
                getString(R.string.sights_graffiti_park_tip),
                R.drawable.hope_graffiti));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.sights_lbj_lib),
                getString(R.string.sights_lbj_lib_cat), getString(R.string.sights_lbj_lib_addr),
                getString(R.string.sights_lbj_lib_web), getString(R.string.sights_lbj_lib_tip),
                R.drawable.lbj_library_2017));

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

        // add a divider between each item
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),
                DividerItemDecoration.VERTICAL));

        return rootView;
    }

}
