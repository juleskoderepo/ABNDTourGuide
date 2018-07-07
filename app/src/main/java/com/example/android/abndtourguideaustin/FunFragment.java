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
public class FunFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rVAdapter;
    private RecyclerView.LayoutManager rVLayoutManager;


    public FunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create an array list of pointsOfInterest and populate
        ArrayList<PointOfInterest> pointsOfInterest = new ArrayList<>();

        pointsOfInterest.add(new PointOfInterest(getString(R.string.fun_alamo_dh),
                getString(R.string.fun_alamo_dh_cat), getString(R.string.fun_alamo_dh_addr),
                getString(R.string.fun_alamo_dh_web), getString(R.string.fun_alamo_dh_tip),
                R.drawable.alamodraft));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.fun_barton_springs),
                getString(R.string.fun_barton_springs_cat),
                getString(R.string.fun_barton_springs_addr),
                getString(R.string.fun_barton_springs_web),
                getString(R.string.fun_barton_springs_tip),
                R.drawable.bartonsprings));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.fun_butler_park),
                getString(R.string.fun_butler_park_cat), getString(R.string.fun_butler_park_addr),
                getString(R.string.fun_butler_park_web), getString(R.string.fun_butler_park_tip),
                R.drawable.butlerpark));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.fun_lb_lake),
                getString(R.string.fun_lb_lake_cat), getString(R.string.fun_lb_lake_addr),
                getString(R.string.fun_lb_lake_web), getString(R.string.fun_lb_lake_tip),
                R.drawable.lady_bird_lake));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.fun_mt_bonnell),
                getString(R.string.fun_mt_bonnell_cat), getString(R.string.fun_mt_bonnell_addr),
                getString(R.string.fun_mt_bonnell_web), getString(R.string.fun_mt_bonnell_tip),
                R.drawable.mtbonnell));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.fun_zilker),
                getString(R.string.fun_zilker_cat), getString(R.string.fun_zilker_addr),
                getString(R.string.fun_zilker_web), getString(R.string.fun_zilker_tip),
                R.drawable.zilker));


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
