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
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create an array list of pointsOfInterest and populate
        ArrayList<PointOfInterest> pointsOfInterest = new ArrayList<>();

        pointsOfInterest.add(new PointOfInterest(getString(R.string.eats_santorini),
                getString(R.string.eats_santorini_cat), getString(R.string.eats_santorini_addr),
                getString(R.string.eats_santorini_web),
                getString(R.string.eats_santorini_tip),
                R.drawable.santorini));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.eats_torchys),
                getString(R.string.eats_torchys_cat), getString(R.string.eats_torchys_addr),
                getString(R.string.eats_torchys_web),
                getString(R.string.eats_torchys_tip),
                R.drawable.torchys_burnet));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.eats_bh),
                getString(R.string.eats_bh_cat), getString(R.string.eats_bh_addr),
                getString(R.string.eats_bh_web),
                getString(R.string.eats_bh_tip),
                R.drawable.bh));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.eats_ramen_tatsuya),
                getString(R.string.eats_ramen_tatsuya_cat),
                getString(R.string.eats_ramen_tatsuya_addr),
                getString(R.string.eats_ramen_tatsuya_web),
                getString(R.string.eats_ramen_tatsuya_tip),
                R.drawable.ramentatsuya));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.eats_little_deli),
                getString(R.string.eats_little_deli_cat), getString(R.string.eats_little_deli_addr),
                getString(R.string.eats_little_deli_web),
                getString(R.string.eats_little_deli_tip),
                R.drawable.littledeli));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.eats_salt_lick),
                getString(R.string.eats_salt_lick_cat), getString(R.string.eats_salt_lick_addr),
                getString(R.string.eats_salt_lick_web),
                getString(R.string.eats_salt_lick_tip),
                R.drawable.saltlickbbq));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.eats_freebirds),
                getString(R.string.eats_freebirds_cat), getString(R.string.eats_freebirds_addr),
                getString(R.string.eats_freebirds_web),
                getString(R.string.eats_freebirds_tip),
                R.drawable.freebirds));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.eats_kerby_lane),
                getString(R.string.eats_kerby_lane_cat), getString(R.string.eats_kerby_lane_addr),
                getString(R.string.eats_kerby_lane_web),
                getString(R.string.eats_kerby_lane_tip),
                R.drawable.kerbylane));

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
