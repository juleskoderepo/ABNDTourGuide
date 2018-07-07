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
public class LocalSpeakFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rVAdapter;
    private RecyclerView.LayoutManager rVLayoutManager;


    public LocalSpeakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        // Create an array list of local speak and populate
        ArrayList<LocalSpeak> localSpeak = new ArrayList<>();

        localSpeak.add(new LocalSpeak(getString(R.string.speak_acl),
                getString(R.string.speak_acl_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_burnet),
                getString(R.string.speak_burnet_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_east_of_35),
                getString(R.string.speak_east_of_35_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_guadalupe),
                getString(R.string.speak_guadalupe_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_i35),
                getString(R.string.speak_i35_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_lady_bird_lake),
                getString(R.string.speak_lady_bird_lake_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_tx360),
                getString(R.string.speak_tx360_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_manchaca),
                getString(R.string.speak_manchaca_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_route1),
                getString(R.string.speak_route1_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_route183),
                getString(R.string.speak_route183_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_south_congress),
                getString(R.string.speak_south_congress_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_sxsw),
                getString(R.string.speak_sxsw_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_ut),
                getString(R.string.speak_ut_local)));
        localSpeak.add(new LocalSpeak(getString(R.string.speak_ut_guadalupe),
                getString(R.string.speak_ut_guadalupe_local)));


        recyclerView = rootView.findViewById(R.id.guide_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        rVLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(rVLayoutManager);

        //specify an adapter
        rVAdapter = new LocalSpRecyclerViewAdapter(localSpeak);
        recyclerView.setAdapter(rVAdapter);

        // add a divider between each item
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),
                DividerItemDecoration.VERTICAL));


        return rootView;
    }

}
