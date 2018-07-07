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
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rVAdapter;
    private RecyclerView.LayoutManager rVLayoutManager;


    public MusicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create an array list of pointsOfInterest and populate
        ArrayList<PointOfInterest> pointsOfInterest = new ArrayList<>();

        pointsOfInterest.add(new PointOfInterest(getString(R.string.music_acl),
                getString(R.string.music_acl_cat), getString(R.string.music_acl_addr),
                getString(R.string.music_acl_web), getString(R.string.music_acl_tip),
                R.drawable.acl_moody_theatre));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.music_austin360),
                getString(R.string.music_austin360_cat),
                getString(R.string.music_austin360_addr),
                getString(R.string.music_austin360_web),
                getString(R.string.music_austin360_tip),
                R.drawable.austin360_cota));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.music_bass),
                getString(R.string.music_bass_cat), getString(R.string.music_bass_addr),
                getString(R.string.music_bass_web), getString(R.string.music_bass_tip),
                R.drawable.bass));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.music_contclub),
                getString(R.string.music_contclub_cat), getString(R.string.music_contclub_addr),
                getString(R.string.music_contclub_web), getString(R.string.music_contclub_tip),
                R.drawable.continentalclub));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.music_paramount),
                getString(R.string.music_paramount_cat), getString(R.string.music_paramount_addr),
                getString(R.string.music_paramount_web), getString(R.string.music_paramount_tip),
                R.drawable.theparamount));
        pointsOfInterest.add(new PointOfInterest(getString(R.string.music_stubbs),
                getString(R.string.music_stubbs_cat), getString(R.string.music_stubbs_addr),
                getString(R.string.music_stubbs_web), getString(R.string.music_stubbs_tip),
                R.drawable.stubbs));


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
